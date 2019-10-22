/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automata;

/**
 *
 * @author chava
 */
public class Automata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] matriz = {{1,3,-1,-1},{-1,1,2,-1},{2,14,-1,99},{-1,-1,2,-1},{-1,-1,-1,99}};
        
        for (int x=0; x < matriz.length; x++) {
            for (int y=0; y < matriz[x].length; y++) {
              System.out.print ("   "+matriz[x][y]);
            }
            System.out.println("");
          }

    }
    
}
