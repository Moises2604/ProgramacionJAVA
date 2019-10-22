/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tap2017;

/**
 *
 * @author chava
 */
public class TortugaThread {
    public void run(){
        int i=0;
        System.out.println("Comienza hilo tortuga");
        while(i<5){
            try{
                //Dormimos el hilo 5 seg
                Thread.sleep(5000);
                System.out.println("Tortuga dormida");
            }catch(Exception e){
                
            }
            i++;
        }
        System.out.println("Termina hilo tortuga");
    }
            
}
