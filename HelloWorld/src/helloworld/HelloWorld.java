/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author lucasabbade
 */
public class HelloWorld
{
    
    public static void main(String[] args)
    {
        Pessoa pessoa = new Pessoa("Joao", 25, "123132312", 1000);
        System.out.println(pessoa.nome);
    }
    
}
