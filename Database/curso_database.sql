CREATE DATABASE curso;

DROP TABLE IF EXISTS vendedor;
CREATE TABLE vendedor (
	id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(45) NOT NULL
);

DROP TABLE IF EXISTS venda;
CREATE TABLE venda (
	id INT AUTO_INCREMENT,
    quantidade INT NOT NULL,
    produtoVendido VARCHAR(45) NOT NULL,
    vendedorId INT,
    PRIMARY KEY(id, vendedorId),
    CONSTRAINT FK_vendedorId FOREIGN KEY (vendedorId)
        REFERENCES vendedor (id) ON UPDATE CASCADE
);

INSERT INTO vendedor (nome) VALUES 
('Joao'),
('Maria'),
('Pedro'),
('Renata'),
('Soned');

INSERT INTO venda (quantidade, produtoVendido, vendedorId) VALUES 
(10, 'Resistor', 2),
(3, 'Capacitor', 4),
(4, 'Resistor', 3),
(12, 'Resistor', 1),
(15, 'Capacitor', 5);
