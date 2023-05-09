/*
El factorial : Realizar un programa que calcule el factorial de un número
*/
import java.util.Scanner;

public class ElFactorial {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Ingrese el número \n");
        int numero = sn.nextInt();
        long factorial = 1;
        for (int i = 1; i <= numero; i++){
            factorial = factorial*i;
        }
        System.out.printf("El factorial del número %d es %d \n", numero, factorial);
        sn.close();
    }
}
