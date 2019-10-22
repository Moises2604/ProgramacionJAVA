
package probando;
import java.util.Scanner;
public class Probando {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int num,num2,result;
        System.out.println("Dame un numero");
        num=leer.nextInt();
        System.out.println("Dame otro numero");
        num2=leer.nextInt();
        result=num+num2;
        System.out.println("La suma es="+result);
    }
    
}
