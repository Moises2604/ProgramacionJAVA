package pkg15460772_sumabinario;

import javax.swing.JOptionPane;

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
                resultado[Apuntador+1] = union[0];
                //actualizamos el apuntador
                if(union[1].equals("L")){
                    Apuntador--;
                }else{
                    Apuntador++;
                }
                //actualizamos el estado
                Estado = Integer.parseInt(union[2]);
                __ERROR = false;
            }
        }while(Estado != 3);
        cadena1 = "";
        if(__ERROR){
            return null;
        }else{
            //una ves terminado volvemos a reescribir la cadena ingresada por la cadena guardada en el vector.
            for(int i = 0; i < resultado.length-1; i++){
                if(!(resultado[i] == null)){
                    cadena1 = cadena1 + resultado[i];
                }
            }
            String __FIN [] = {cadena1,TRANSICIONES};
            return __FIN;
        }
    }
    public String[] auxiliar(int estado, String caracter1, String caracter2){
        String Vector_Desicion[][]= {{"0","$","$","$","L","1"},
                                    {"1","0","0","0","L","1"}, //:Estado,Caracter Leido1,Caracter Leido2, Caracter a sobreescribir, Movimiento, Nuevo estado
                                    {"1","0","1","1","L","1"},
                                    {"1","1","0","1","L","1"},
                                    {"1","1","1","0","L","2"},
                                    {"1","$","$","0","L","3"},
                                    {"2","0","0","1","L","1"}, //:Estado,Caracter Leido1,Caracter Leido2, Caracter a sobreescribir, Movimiento, Nuevo estado
                                    {"2","0","1","0","L","2"},
                                    {"2","1","0","0","L","2"},
                                    {"2","1","1","1","L","2"},
                                    {"2","$","$","1","L","3"},};
        String Nestado = ""+estado;
        String union[] = {"X","X","X"};
        
        if((!caracter1.equals("1") && !caracter1.equals("0") && !caracter1.equals("$")) ||
                    (!caracter2.equals("1") && !caracter2.equals("0") && !caracter2.equals("$"))){
                JOptionPane.showMessageDialog(null,"Error: Caracter Invalido");
                union = null;
        }else{
            for(int i = 0; i < 11; i++){
            if(Vector_Desicion[i][0].equals(Nestado) && Vector_Desicion[i][1].equals(caracter1) && Vector_Desicion[i][2].equals(caracter2)){
                for(int j = 3; j < 6; j++){
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
        }else{
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
