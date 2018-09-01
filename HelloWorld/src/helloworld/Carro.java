/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;



public class Carro
{
    String placa;
    String marca;
    String modelo;
    String cor;
    int kilometragem;
    int numCilindros;
    
    public void Acelerar(){
        bombearGasolina();
        abreValvulasDeInjecao();
        // ...
    }
    
    private void bombearGasolina() {
        // joga a gasolina pro motor
    }
    
    private void abreValvulasDeInjecao() {
        // permite q a gasolina entre na camara de combustao
    }
    
}
