/* 
Caracteres : Guarde en distintos espacios de memoria los caracteres de su nombre
y luego imprimirlos por pantalla. ¿Por qué no puede usar "" en el char?
*/
import java.util.Scanner;

public class Caracteres {
    public static void main(String[] args) {
        
        System.out.println("Ingrese su nombre"); 
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        String[] ch = nombre.split("");

        for (int i = 0; i < ch.length ; i++ ){
            System.out.println(ch[i]);
        }
        sc.close();             
    }  
}

