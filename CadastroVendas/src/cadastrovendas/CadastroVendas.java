/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrovendas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lucasabbade
 */
public class CadastroVendas
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Vendedor> vendedores = new ArrayList<>();
        ArrayList<Venda> vendas = new ArrayList<>();
        exibirMenu();
        
        while (true) {
            int op = sc.nextInt();
            
            if (op == 1) {
                Vendedor novoVendedor = criarVendedor(sc);
                vendedores.add(novoVendedor);
            } else if (op == 2) {
                Venda novaVenda = criarVenda(sc);
                vendas.add(novaVenda);
            } else if (op == 3) {
                for (int i = 0; i < vendedores.size(); i++) {
                    System.out.println(vendedores.get(i));
                }
            } else if (op == 4) {
                for (int i = 0; i < vendas.size(); i++) {
                    System.out.println(vendas.get(i));
                }
            } else if (op == 5) {
                break;
            } else {
                System.out.println("Opcao invalida");
            }
            
            exibirMenu();
        }
    }
    
    public static void exibirMenu() {
        System.out.println("1 - Registrar vendedor");
        System.out.println("2 - Registrar venda");
        System.out.println("3 - Exibir vendedores");
        System.out.println("4 - Exibir vendas");
        System.out.println("5 - Sair");
    }
    
    public static Vendedor criarVendedor(Scanner scanner) {
        System.out.print("Digite o nome do vendedor: ");
        String nome = scanner.next();
        System.out.print("* nome pego: ");
        System.out.println(nome);
        Vendedor v = new Vendedor(nome);
        return v;
    }
    
    public static Venda criarVenda(Scanner scanner) {
        System.out.print("Qual o ID do vendedor? ");
        int id = scanner.nextInt();
        System.out.print("Qual produto foi vendido (resistor ou capacitor)? ");
        String produtoVendido = scanner.next();
        System.out.print("Quantidade vendida: ");
        int quantidade = scanner.nextInt();
        Produto p;
        
        if (produtoVendido == "resistor") {
            p = new Resistor(2.50, "1K", 10);
        } else {
            p = new Capacitor(0.10, 1000, 0.1);
        }
        
        Venda v = new Venda(id, p, quantidade);
        return v;
    }
    
}
