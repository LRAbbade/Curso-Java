/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrovendas;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lucasabbade
 */
public class CadastroVendas
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException
    {
        InterfaceCadastro interfaceCadastro = new InterfaceCadastro();
        interfaceCadastro.setVisible(true);
    }
    
}
