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
public class Venda
{
    private int idVendedor;
    public Produto produtoVendido;
    public int quantidade;
    
    public Venda(int id, Produto produtoVendido, int quantidade){
        idVendedor = id;
        this.produtoVendido = produtoVendido;
        this.quantidade = quantidade;
    }
    
    public int getIdVendedor() {
        return idVendedor;
    }
    
    @Override
    public String toString() {
        return (Integer.toString(idVendedor) + " " + produtoVendido.toString() + " " + Integer.toString(quantidade));
    }
}
