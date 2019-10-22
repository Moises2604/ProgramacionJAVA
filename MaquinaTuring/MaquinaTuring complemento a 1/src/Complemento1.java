import javax.swing.JOptionPane;
public class Complemento1 {
    
    public String OPERACION(String cadena){
        
        int Apuntador = 0;
        int Estado = 0;
        boolean __ERROR = false;
        //Ingresamos la cadena a un vector
        String Vector_Cadena [] = new String[cadena.length()];
        for(int i = 0; i < cadena.length(); i++){
            Vector_Cadena[i] = ""+cadena.charAt(i);
        }
        
        do{
            String caracter = Vector_Cadena[Apuntador];
            //obtenemos los elementos a modificar con la funcion auxiliar.
            String union[] = auxiliar(Estado,caracter);
            if(union == null){
                __ERROR = true;
                break;
            }else{
                //sobreescribimos el nuevo caracter.
                Vector_Cadena[Apuntador] = union[0];
                //actualizamos el apuntador
                if(union[1] == "R"){
                    Apuntador++;
                }else{
                    Apuntador--;
                }
                //actualizamos el estado
                Estado = Integer.parseInt(union[2]);
                __ERROR = false;
            }
        }while(Estado != 1);
        
        cadena = "";
        if(__ERROR){
            return cadena;
        }else{
            //una ves terminado volvemos a reescribir la cadena ingresada por la cadena guardada en el vector.
            for(int i = 0; i < Vector_Cadena.length-1; i++){
            cadena = cadena + Vector_Cadena[i];
            }
            return cadena;
        }
    }
    
    public String[] auxiliar(int estado, String caracter){
        String Vector_Desicion[][] = {{"0","0","1","R","0"}, //:Estado,Caracter Leido,Caracter a sobreescribir, Movimiento, Nuevo estado
                                    {"0","1","0","R","0"},
                                    {"0","$","$","R","1"}};
        String Nestado = ""+estado;
        String union[] = new String[3];
        for(int i = 0; i < 3; i++){
            if(!caracter.equals("1") && !caracter.equals("0") && !caracter.equals("$")){

                JOptionPane.showMessageDialog(null,"Error: Caracter Invalido ("+caracter+")");
                union = null;
                break;
            }else{
                if(Vector_Desicion[i][0].equals(Nestado) && Vector_Desicion[i][1].equals(caracter)){
                for(int j = 2; j < 5; j++){
                    union[j-2] = Vector_Desicion[i][j];}}
            }
        }
        return union;
    }
}

