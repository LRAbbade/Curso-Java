/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;


public class Cachorro extends Animal
{
    public Cachorro(String raca, int idade) {
        this.raca = raca;
        this.idade = idade;
    }
    
    @Override
    public void comer() {
        // cachorro come
    }
    
    @Override
    public void falar() {
        System.out.println("AU AU");
    }
}


