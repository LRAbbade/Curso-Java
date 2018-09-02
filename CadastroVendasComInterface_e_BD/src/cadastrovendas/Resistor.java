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
public class Resistor extends Produto
{
    public String resistencia;
    public int margem;
    
    public Resistor(double precoAux, String resistenciaAux, int margemAux) {
        preco = precoAux;
        resistencia = resistenciaAux;
        margem = margemAux;
    }
    
    @Override
    public String toString() {
        return ("resistor, preco: " +
                Double.toString(preco) + 
                ", resistencia: " + resistencia + 
                ", margem: " + 
                Integer.toString(margem));
    }
}
