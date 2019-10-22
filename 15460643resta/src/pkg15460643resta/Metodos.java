/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg15460643resta;
import javax.swing.JOptionPane;
/**
 *
 * @author chava
 */
public class Metodos {
    



    public String[] OPERACION(String cadena1, String cadena2){
        String TRANSICIONES = "";
        String v [] = ValidarCadenas(cadena1,cadena2);
        cadena1 = v[0];
        cadena2 = v[1];
        
        int Apuntador = cadena1.length()-1;
        int Estado = 0;
        boolean __ERROR = false;
        //Ingresamos la cadena a un vector
        String Vector_Cadena1 [] = new String[cadena1.length()];
        String Vector_Cadena2 [] = new String[cadena2.length()];
        String resultado [] = new String[cadena1.length()+1];
        for(int i = 0; i < cadena1.length(); i++){
            Vector_Cadena1[i] = ""+cadena1.charAt(i);
            Vector_Cadena2[i] = ""+cadena2.charAt(i);
        }
        do{
            String caracter1 = Vector_Cadena1[Apuntador];
            String caracter2 = Vector_Cadena2[Apuntador];
            TRANSICIONES = TRANSICIONES +"("+Estado+"{"+caracter1+","+caracter2+"}) -> ";
            //obtenemos los elementos a modificar con la funcion auxiliar.
            String union[] = auxiliar(Estado,caracter1,caracter2);
            TRANSICIONES = TRANSICIONES +"{"+union[0]+","+union[1]+","+union[2]+"}\n";
            if(union == null){
                __ERROR = true;
                break;
            }else{
                //sobreescribimos el nuevo caracter.
                if(union[3].equals("F")){
                    resultado[Apuntador+1] = union[0];
                }else if(union[3].equals("S")){
                    Vector_Cadena2[Apuntador] = union[0];
                }
                //actualizamos el apuntador
                if(union[1].equals("L")){
                    Apuntador--;
                }else if(union[1].equals("R")){
                    Apuntador++;
                }
                //actualizamos el estado
                Estado = Integer.parseInt(union[2]);
                __ERROR = false;
            }
        }while(Estado != 6);
        cadena1 = "";
        if(__ERROR){
            return null;
        }else{
            //una ves terminado volvemos a reescribir la cadena ingresada por la cadena guardada en el vector.
            for(int i = 0; i < resultado.length-1; i++){
                if(!(resultado[i] == null) && !(resultado[i].equals("$"))){
                    cadena1 = cadena1 + resultado[i];
                }
            }
            String __FIN [] = {cadena1,TRANSICIONES};
            return __FIN;
        }
    }
    public String[] auxiliar(int estado, String caracter1, String caracter2){
        String Vector_Desicion[][]= {{"0","$","$","$","L","1","S"},
                                    {"1","0","0","0","L","1","S"},
                                    {"1","0","1","1","L","2","S"},
                                    {"1","1","0","0","L","1","S"},
                                    {"1","1","1","1","L","2","S"},
                                    {"1","$","$","$","R","3","S"},
                                    {"2","0","1","0","L","2","S"},
                                    {"2","0","0","1","L","2","S"},
                                    {"2","1","1","0","L","2","S"},
                                    {"2","1","0","1","L","2","S"},
                                    {"2","$","$","$","R","3","S"},
                                    {"3","0","0","$","R","3","F"},
                                    {"3","0","1","$","R","3","F"},
                                    {"3","1","0","$","R","3","F"},
                                    {"3","1","1","$","R","3","F"},
                                    {"3","$","$","$","L","4","F"},
                                    {"4","0","0","0","L","4","F"},
                                    {"4","0","1","1","L","4","F"},
                                    {"4","1","0","1","L","4","F"},
                                    {"4","1","1","0","L","5","F"},
                                    {"4","$","$","$","R","6","F"},
                                    {"5","0","0","1","L","4","F"},
                                    {"5","0","1","0","L","5","F"},
                                    {"5","1","0","0","L","5","F"},
                                    {"5","1","1","1","L","5","F"},
                                    {"5","$","$","1","R","6","F"},};
        String Nestado = ""+estado;
        String union[] = {"X","X","X","X"};
        
        if((!caracter1.equals("1") && !caracter1.equals("0") && !caracter1.equals("$")) ||
                    (!caracter2.equals("1") && !caracter2.equals("0") && !caracter2.equals("$"))){
                JOptionPane.showMessageDialog(null,"Error: Caracter Invalido");
                union = null;
        }else{
            for(int i = 0; i < 26; i++){
            if(Vector_Desicion[i][0].equals(Nestado) && Vector_Desicion[i][1].equals(caracter1) && Vector_Desicion[i][2].equals(caracter2)){
                for(int j = 3; j < 7; j++){
                    union[j-3] = Vector_Desicion[i][j];}}
            }
        }
        return union;
    }
    public String[] ValidarCadenas(String a, String b){
        if(a.length() < b.length()){
            for(int i = a.length() ;i < b.length(); i++){
                a = "0"+a;
            }
        }else {
            for(int i = b.length() ;i < a.length(); i++){
                b = "0"+b;
            }
        }
        a = "$"+a+"$";
        b = "$"+b+"$";
        String v[]={a,b};
        return v;
    }
}


