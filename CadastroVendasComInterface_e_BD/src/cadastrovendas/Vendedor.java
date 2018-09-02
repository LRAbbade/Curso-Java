/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrovendas;

/**
 *
 * @author lucasabbade
 */
public class Vendedor
{
    static int id = 0;
    public String nome;
    private int personalId;
    
    public Vendedor (int personalId, String nome) {
        this.personalId = personalId;
        this.nome = nome;
    }
    
    public Vendedor (String nome) {
        this.nome = nome;
        personalId = id;
        id++;
    }
    
    public int getPersonalId(){
        return personalId;
    }
    
    public Venda registrarVenda(Produto p, int quantidade) {
        Venda v = new Venda(personalId, p, quantidade);
        return v;
    }
    
    @Override
    public String toString() {
        return ("ID: " + Integer.toString(personalId) + ", nome: " + nome);
    }
}
