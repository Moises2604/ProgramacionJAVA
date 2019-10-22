/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.util.Scanner;

/**
 *
 * @author chava
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner leer=new Scanner(System.in);
    int a;
    int b;
    System.out.println("Programa del uso del IF");
    System.out.println("--------------------------");
    System.out.println("Dame el primer numero");
    a=leer.nextInt();
    System.out.println("Dame el el segundo numero");
    b=leer.nextInt();
    if (a<b){
        System.out.println("El primer numero es menor que el segundo");
    
    }else{
        System.out.println("El primer numero es mayor que el segundo");
    }
    }
    
}
