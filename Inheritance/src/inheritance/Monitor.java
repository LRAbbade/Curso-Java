/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;


public class Monitor extends Aluno
{
    public Monitor(String nome, int matricula, int senha) {
        super(nome, matricula, senha);
    }
    
    public void registrarFrequencia() {
        // abre o modulo de registrar frequencia
    }
}


