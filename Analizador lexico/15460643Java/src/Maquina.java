public class Maquina {
    
    private static boolean respuesta;
    private Cadenas obj;
    
    public Maquina(){}
    
    public boolean MaquinaOperadorRelacional(String Cadena){
        int Lenguaje [] = {-1,9,10,11,12};
        int Es_Aceptacion [] = {2,3};
        int Estados [][] = {{0,2,2,1,1},
                            {1,-1,-1,3,-1},
                            {2,-1,-1,3,-1},
                            {3,-1,-1,-1,-1}};
        
        return aux(Lenguaje,Es_Aceptacion,Estados,Cadena);
    }
    public boolean MaquinaOperadorAsignacion(String Cadena){
        int Lenguaje [] = {-1,11,4,5,6,7,8};
        int Es_Aceptacion [] = {1,2};
        int Estados [][] = {{0,1,-1,-1,-1,-1,-1},
                            {1,-1,2,2,2,2,2},
                            {2,-1,-1,-1,-1,-1,-1}};
        
        return aux(Lenguaje,Es_Aceptacion,Estados,Cadena);
    }
    public boolean MaquinaOperadorUnitario(String Cadena){
        //si es necesario agregar los signos negativo y positivo... agregar los estados de aceptacion {1 Y 3}
        int Lenguaje [] = {-1,4,5};
        int Es_Aceptacion [] = {4,2};
        int Estados [][] = {{0,3,1},
                            {1,-1,2},
                            {2,-1,-1},
                            {3,4,-1},
                            {4,-1,-1}};
        
        return aux(Lenguaje,Es_Aceptacion,Estados,Cadena);
    }
    public boolean MaquinaOperadorAritmetico(String Cadena){
        int Lenguaje [] = {-1,4,5,6,7,8};
        int Es_Aceptacion [] = {1};
        int Estados [][] = {{0,1,1,1,1,1},
                            {1,-1,-1,-1,-1,-1}};
        
        return aux(Lenguaje,Es_Aceptacion,Estados,Cadena);
    }
    public boolean MaquinaOperadorLogico(String Cadena){
        int Lenguaje [] = {-1,13,12,14};
        int Es_Aceptacion [] = {1,3};
        int Estados [][] = {{0,2,1,2},
                            {1,-1,-1,-1},
                            {2,3,-1,3},
                            {3,-1,-1,-1}};
        
        return aux(Lenguaje,Es_Aceptacion,Estados,Cadena);
    }
    public boolean MaquinaNumero(String Cadena){
        int Lenguaje [] = {-1,1,2};
        int Es_Aceptacion [] = {1,3};
        int Estados [][] =  {{0,1,-1},
                            {1,1, 2},
                            {2,3,-1},
                            {3,3,-1}};
        
        return aux(Lenguaje,Es_Aceptacion,Estados,Cadena);
    }
    public boolean MaquinaIdentificador(String Cadena){
        int Lenguaje [] = {-1,0,3,1};
        int Es_Aceptacion [] = {1};
        int Estados [][] = {{0,1,1,-1},
                            {1,1,1, 1}};
        
        return aux(Lenguaje,Es_Aceptacion,Estados,Cadena);
    }
    
    public boolean aux(int Lenguaje [], int Es_Aceptacion [], int Estados [][], String Cadena){
        obj = new Cadenas(Lenguaje,Es_Aceptacion,Estados);
        respuesta = obj.OPERACION(Cadena);
        return respuesta;
    }
    

}
