/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg15460643c1;
  

/**
 *
 * @author chava
 */
public class Main {
    
      public class registro{
      int x;
      int y;
       }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        registro [] myreg = new registro[10];
        int x;
        for (x = 0; x < 10; x++) {
            myreg[x].x=x+1;
            myreg[x].y=x+1;          
        }
        for (x = 0; x < 10; x++) {
            System.out.println(myreg[x].x+myreg[x].y);
        }
    }
    
}
