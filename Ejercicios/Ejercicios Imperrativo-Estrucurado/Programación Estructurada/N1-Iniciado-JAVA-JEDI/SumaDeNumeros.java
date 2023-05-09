/*
Suma de números : Realizar un programa que guarde un número en memoria y
determine si es par o impar.
*/
import java.util.Scanner;
public class SumaDeNumeros {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Ingrese número \n");
        int numero = sn.nextInt();
        String paridad = numero%2 == 0 ? "PAR" : "IMPAR";

        System.out.printf("El número es %s", paridad);
        sn.close();
    }
}
