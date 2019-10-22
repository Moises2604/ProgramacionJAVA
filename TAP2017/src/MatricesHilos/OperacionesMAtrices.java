/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MatricesHilos;

/**
 *
 * @author chava
 */
public class OperacionesMAtrices {
    //definimos dimensiones de matrices
    private static int R = 1500;
    private static int C = 1500;
    
    //definimos matrices
    private int MatA[][] = new int [R][C];
    private int MatB[][] = new int [R][C];
    private int MatSuma[][] = new int [R][C];
    private int MatResta[][] = new int [R][C];
    private int MatMul[][] = new int [R][C];
    
    public OperacionesMAtrices (){
        
    }
    
    //LLenar matrices con datos
    private void llenaMatriz (){
        long ti, tf;
        //get start
        
        ti=System.currentTimeMillis();
        for(int i=0; i<R; i++){
            for (int j=0; j<C;i++){
                MatA[i][j]=(int) (Math.random()*1000);
                MatB[i][j]=(int) (Math.random()*100);
                
            }
        }
        tf=System.currentTimeMillis();
        System.out.println("Tiempo transcurrido pot rutina llenar matriz "+ (tf-ti));
    }
        private void llenaMatrizB (){
            long ti, tf;
        //get start
        
        ti=System.currentTimeMillis();
        for(int i=0; i<R; i++){
            for (int j=0; j<C;i++){
                MatB[i][j]=(int) (Math.random()*1000);
            }
        }
        tf=System.currentTimeMillis();
        System.out.println("Tiempo transcurrido pot rutina llenar matriz "+ (tf-ti));
    }
     private void suma (){
            long ti, tf;
        //get start
        
        ti=System.currentTimeMillis();
        for(int i=0; i<R; i++){
            for (int j=0; j<C;i++){
                MatSuma[i][j]= MatA[i][j] + MatB[i][j];
            }
        }
        tf=System.currentTimeMillis();
        System.out.println("Tiempo transcurrido pot rutina llenar matriz "+ (tf-ti));
    }  
      private void resta (){
          long ti, tf;
        //get start
        
        ti=System.currentTimeMillis();
        for(int i=0; i<R; i++){
            for (int j=0; j<C;i++){
                MatResta[i][j]= MatA[i][j] - MatB[i][j];
            }
        }
        tf=System.currentTimeMillis();
        System.out.println("Tiempo transcurrido pot rutina llenar matriz "+ (tf-ti));
        
    }
         private void multiplicaMatriz (){
              long ti, tf;
        //get start
        
        ti=System.currentTimeMillis();
        for(int i=0; i<R; i++){
            for (int j=0; j<C;i++){
                MatMul[i][j]= 0;
                for (int k=0;k<C;k++){
                 MatMul[i][j]=(MatMul[i][j]+(MatMul[i][j]*MatMul[i][j])) ;  
                }
            }
        }
        tf=System.currentTimeMillis();
        System.out.println("Tiempo transcurrido pot rutina llenar matriz "+ (tf-ti));
        
    }   
          public static void main(String[] args) {
             OperacionesMAtrices opm=new OperacionesMAtrices();
             opm.llenaMatriz();
             opm.llenaMatrizB();
             opm.suma();
             opm.resta();
             opm.multiplicaMatriz();
          }

        
        
}
