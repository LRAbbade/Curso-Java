/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrovendas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author lucasabbade
 */
public class DAO
{
    private Connection connection = null;
    private PreparedStatement statement = null;

    public void connect(String database) throws SQLException {
        String servidor = "jdbc:mysql://localhost:3306/" + database;
        String user = "root";
        String pwd = "";
        try {
            connection = DriverManager.getConnection(servidor, user, pwd);
            System.out.println("Connection status: " + isConnected());
        } catch (Exception e) {
            System.out.println("Erro = " + e);
        }
    }

    public boolean isConnected() {
        return (connection != null);
    }
    
    /**
     * Insere um vendedor no banco de dados 
     * @param v = vendedor a ser inserido
     * @return true se a insercao foi bem sucedida, se nao false
     */
    public boolean insert(Vendedor v) {
        String query = "INSERT INTO vendedor (nome) VALUES (?)";
        
        try {
            statement = connection.prepareStatement(query);
            statement.setString(1, v.nome);
            statement.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Erro = " + e);
            return false;
        }
    }
    
    public boolean insert(Venda v) {
        String query = "INSERT INTO venda (quantidade, produtoVendido, vendedorId) VALUES (?, ?, ?)";
        
        try {
            statement = connection.prepareStatement(query);
            statement.setInt(1, v.quantidade);
            statement.setString(2, v.produtoVendido.getClass().getSimpleName());
            statement.setInt(3, v.getIdVendedor());
            statement.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Erro = " + e);
            return false;
        }
    }
    
    public ArrayList<Vendedor> findVendedores() {
        String query = "SELECT * FROM vendedor;";
        ArrayList<Vendedor> r = new ArrayList<>();
        
        try {
            statement = connection.prepareStatement(query);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                r.add(new Vendedor(rs.getInt("id"), rs.getString("nome")));
            }
            return r;
        } catch (Exception e) {
            System.out.println("Erro = " + e);
            return null;
        }
    }
    
    public ArrayList<Venda> findVendas() {
        String query = "SELECT * FROM venda;";
        ArrayList<Venda> r = new ArrayList<>();
        
        try {
            statement = connection.prepareStatement(query);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Produto p;
                if (rs.getString("produtoVendido").equals("Resistor")) {
                    p = new Resistor(3.5, "1.2k", 5);
                } else {
                    p = new Capacitor(5.1, 1000, 0.1);
                }
                Venda v = new Venda(rs.getInt("vendedorId"), p, rs.getInt("quantidade"));
                r.add(v);
            }
            return r;
        } catch (Exception e) {
            System.out.println("Erro = " + e);
            return null;
        }
    }

    public void close() throws SQLException {
        connection.close();
    }
}
