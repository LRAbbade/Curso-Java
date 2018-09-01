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
public class Capacitor extends Produto
{
    public int capacitancia;
    public double tensao;
    
    public Capacitor(double preco, int capacitancia, double tensao) {
        this.preco = preco;
        this.capacitancia = capacitancia;
        this.tensao = tensao;
    }
}
