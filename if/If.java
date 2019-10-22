/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif;

import java.util.Scanner;

/**
 *
 * @author chava
 */
public class If {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner leer=new Scanner(System.in);
    int a=0;
    int b=0;
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
