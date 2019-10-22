/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tap2017;

import java.io.*;
import java.lang.*;
public class LiebreThread implements Runnable {
    @Override
    public void run(){
      int i=0;
        System.out.println("Comienza la liebre");
        while (i<5){
            try{
                Thread.sleep(2000);
                System.out.println("liebre ");
            }catch (Exception e){
                
            } 
            i++;
        }
        System.out.println("termina hilo liebre");
    }
    
}
