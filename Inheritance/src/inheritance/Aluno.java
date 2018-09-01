/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;


public class Aluno
{
    public String nome;
    public int matricula;
    private int senha;
    
    public Aluno(String nome, int matricula, int senha) {
        this.nome = nome;
        this.matricula = matricula;
        this.senha = senha;
    }
    
    public void verHorario() {
        // exibe o horario do aluno
    }
    
    public void verNotas() {
        // exibe as notas
    }
}

