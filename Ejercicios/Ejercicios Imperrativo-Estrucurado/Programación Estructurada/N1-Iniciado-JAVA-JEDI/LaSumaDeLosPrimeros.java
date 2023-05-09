/*
 * La suma de los primeros: Realizar un programa que calcule la suma de los
primeros N números naturales, donde N es un número entero guardado en memoria.
*/
import java.util.Scanner;

public class LaSumaDeLosPrimeros {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Ingrese número \n");
        int numero = sn.nextInt();
        int nNumeros = 0;
        for (int i = 1; i <= numero; i++) {
            nNumeros += i;
        }
        System.out.printf("La suma de los %d primeros números es %d", numero, nNumeros);
        sn.close();
    }
}
