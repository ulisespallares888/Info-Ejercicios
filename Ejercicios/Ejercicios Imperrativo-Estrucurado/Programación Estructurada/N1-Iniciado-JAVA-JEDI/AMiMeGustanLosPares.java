/*
A mi me gustan los apres: Escribe un programa que imprima solo los N números
pares, donde los N números son guardados en variables o constantes según
corresponda.
*/
import java.util.Scanner;

public class AMiMeGustanLosPares {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Ingrese número \n");
        int numero = sn.nextInt();
        int nNumerosPares = 0;
        for (int i = 1; i <= numero; i++) {
            nNumerosPares += (i % 2 == 0? i : 0);
        }
        System.out.printf("La suma de los %d primeros números pares es %d", numero, nNumerosPares);
        sn.close();
    }
}
