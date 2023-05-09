/*
Acumulador: Se le solicita que guarde en un espacio de memoria la acumulación
de quince multiplicaciones entre dos números enteros divididos por el número de la
multiplicación. Por ejemplo:
Numero1*Numero2/1 + Numero1*Numero2/2 + … + Numero1*Numero2/15
El resultado mostrarlo por pantalla.
*/

import java.util.Scanner;
public class Acumulador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        double num1 = sc.nextDouble();
        System.out.println("Ingrese el segundo número:");
        double num2 = sc.nextDouble();

        double acumulador = 0.0;
        for (int i = 1; i <= 15; i++) {
            acumulador += (num1 * num2) / i;
        }

        System.out.printf("Valor del acumulador %f \n",acumulador);
        sc.close();
    }
}
