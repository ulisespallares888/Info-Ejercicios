/*
Suma de dos números bis: Se les solicita que guarden dos números enteros y los
sumen. El resultado guardarlo, mostrarlo por pantalla junto con un mensaje que
indique si se trata de un número par o impar.
*/
import java.util.Scanner;

public class SumaBis {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero:");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero:");
        int num2 = sc.nextInt();
        sc.close();

        int resultado = num1 + num2;
        String paridad = resultado % 2 == 0 ? "Par":"Impar";
        System.out.printf("El nuemro %d es %s",resultado,paridad);
   
    }
    
}
