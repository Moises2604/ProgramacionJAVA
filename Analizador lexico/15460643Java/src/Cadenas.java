public class Cadenas {
    
    private final int Lenguaje [];
    private final int Es_Aceptacion [];
    private final int Estados [][];
    private static int q;
    private static final String LenguajeU [] = {"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz",
                    /*1*/      "0123456789",
                    /*2*/          ".",
                    /*3*/          "_$",
                    /*4*/          "+",
                    /*5*/          "-",
                    /*6*/          "*",
                    /*7*/          "/",
                    /*8*/          "%",
                    /*9*/          ">",
                    /*10*/          "<",
                    /*11*/          "=",
                    /*12*/          "!",
                    /*13*/          "&",
                    /*14*/          "|",
                    /*15*/          ";,:",
                    /*16*/          "{}[]()'",};
    
    public Cadenas(int Lenguaje [], int Es_Aceptacion [], int Estados [][]){
        this.Lenguaje = Lenguaje;
        this.Es_Aceptacion = Es_Aceptacion;
        this.Estados = Estados;
    }
    
    public boolean OPERACION(String cadena){
        cadena = cadena + "#";
        boolean __EXIT = true;
        char aux;
        int con_cadena = 0;
        int i_estado = 0, index = 0;
        do{
            aux = cadena.charAt(con_cadena);
            if(ExisteLenguaje(aux)){
                index = Estados[i_estado][q];
                i_estado = IndexM(Estados[i_estado][q]);
                if(index < 0){
                    __EXIT = false;
                    break;
                }
                con_cadena++;
            }else if(aux == '#'){
                if(!EstadoAceptacion(index)){
                    __EXIT = false;
                }else{
                    __EXIT = true;
                }
                break;
            }else{
                __EXIT = false;
                break;
            }
        }while(true);
        return __EXIT;
    }
    public boolean ExisteLenguaje(char x){
        int i = 1;
        boolean e = false;
        while(i < Lenguaje.length){
            if(LenguajeU[Lenguaje[i]].contains(""+x)){
                e = true;
                //La variable q, es para control de los estados de la matriz.
                q = i;
                break;
            }
            i++;
        }
        return e;
    } 
    public boolean EstadoAceptacion(int x){
        boolean o = false;
        for(int i = 0; i < Es_Aceptacion.length; i++){
            if(x == Es_Aceptacion[i]){
                o = true;
                break;
            }
        }
        return o;
    }
    public int IndexM(int x){
        int j = 0;
        for(int i = 0; i < Estados.length; i++){
            if(x == Estados[i][0]){
                j = i;
                break;
            }
        }
        return j;
    }
}
