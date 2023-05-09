/*
Suma del rango de números : Escribir un programa que encuentre la suma de los
números impares en un rango de números enteros guardados en una variable.
*/
import java.util.Scanner;

public class SumaDelRangoDeNumeros {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Ingrese inicio del rango \n");
        int inicio = sn.nextInt();
        System.out.print("Ingrese tope del rango \n");
        int tope = sn.nextInt();
        int acumladorImpares = 0;
        for (int i = inicio; i <= tope; i++){
            if (i % 2 != 0){
                acumladorImpares += i;
            }
        }
        System.out.printf("La suma de los números impares que estan entre %d y %d es %d \n",inicio, tope, acumladorImpares);
        sn.close();
    }
}
