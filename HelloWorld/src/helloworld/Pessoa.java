/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

public class Pessoa
{
    // atributos
    public String nome;
    public int idade;
    private String cpf;
    private int salario;
    
    public Pessoa(String nome, int idade, String cpf, int salario) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.salario = salario;
    }
    
    public Pessoa() {
        this("", 0, "", 0);
    }
}

