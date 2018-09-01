/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;


public class Gato extends Animal
{
    public Gato(String raca, int idade) {
        this.raca = raca;
        this.idade = idade;
    }
    
    @Override
    public void comer() {
        // gato come
    }
    
    @Override
    public void falar() {
        System.out.println("miau");
    }
}


