/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caracteres;

import java.util.Scanner;

/**
 *
 * @author chava
 */
public class Caracteres {

    /**
     * @param args the command line arguments
     */

            
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        String cadena;
        System.out.println("Programa para separar cadena caracter por caracter");
        System.out.println("Ingresar cadena");
        cadena=leer.next();
        System.out.println("Cadena Separada:");
        for(int i=0;i<cadena.length();i++){
            System.out.println(cadena.charAt(i));
                       
        }
        
        
    }
    
}
