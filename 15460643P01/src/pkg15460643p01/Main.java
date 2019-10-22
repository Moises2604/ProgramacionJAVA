/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg15460643p01;

import java.util.Scanner;

/**
 *
 * @author chava
 */

public class Main {

    /**
     * @param args the command line arguments
     */
           public String Inver(String Inversa) {
            if (Inversa.length() == 1)
            return Inversa;
            else
            return Inver(Inversa.substring(1)) + Inversa.charAt(0);
            }
           public String Pot (String Potencia,int num){
               String a="";
               if(num==0){
                   return a;
               }else{
                   a=a+Potencia;
                  num--;
                  return a+Pot(a,num);
               }
           }
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer=new Scanner(System.in);
         String Inversa,Potencia;
         String condicion;
         int opcion,num;
         Main obj=new Main();
         System.out.println("BIENVENIDO");
         System.out.println("Lenguajes y Automatas 1");
         do{
         System.out.println("Programa para hacer operaciones con cadenas");
         System.out.println("Seleccione una operacion con Cadena");
         System.out.println("1.....Inversa Cadena.....");
         System.out.println("2.....Potencia de Cadena.....");
         System.out.println("3.....Salir.....");
         opcion=leer.nextInt();
         switch(opcion){
             case 1:{
                 System.out.println("Inversa de una Cadena");
                 System.out.println("Ingresar Cadena");
                 Inversa=leer.next();
                 
                 System.out.println(obj.Inver(Inversa));
                 
             }
             break;
             case 2:{
                 System.out.println("Potencia de una Cadena");
                 System.out.println("Ingresar Cadena");
                 Potencia=leer.next();
                 System.out.println("A la cuanto la quieres elevar?");
                 num=leer.nextInt();
                 System.out.println(obj.Pot(Potencia, num));
             }
             break;
         
         }
         }while(opcion!=3);   
         System.out.println("Muchas Gracias");
         System.out.println("Adios");
    } 
}
