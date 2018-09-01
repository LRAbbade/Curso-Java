/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;





/**
 *
 * @author lucasabbade
 */
public class Inheritance
{

    
    public static void main(String[] args)
    {
        Animal[] animais = new Animal[4];
        animais[0] = new Cachorro("Pinscher", 12);
        animais[1] = new Gato("Persa", 7);
        animais[2] = new Gato("Garfield", 14);
        animais[3] = new Cachorro("Husky", 4);
        
        for (int i = 0; i < animais.length; i++){
            System.out.println(animais[i].raca);
            animais[i].falar();
        }
    }
    
}
