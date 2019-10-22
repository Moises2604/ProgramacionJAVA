import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Archivos {
    private FileInputStream Entrada;
    private FileOutputStream Salida;
    
    public Archivos(){}
    
    public String AbrirArchivo(File Archivo){
        String Contenido = "";
        try{
            Entrada = new FileInputStream(Archivo);
            int aux;
            while((aux = Entrada.read()) != -1){
                char l = (char)aux;
                Contenido += l;
            }
            Entrada.close();
        }catch(IOException e){}
        return Contenido;
    }
    
    public String GuardarArchivo(File Archivo, String Contenido){
        try{
            Salida = new FileOutputStream(Archivo);
            byte[] bytesTxt = Contenido.getBytes();
            Salida.write(bytesTxt);
            Salida.close();
        }catch(IOException e){}
        return null;
    }
    
}
