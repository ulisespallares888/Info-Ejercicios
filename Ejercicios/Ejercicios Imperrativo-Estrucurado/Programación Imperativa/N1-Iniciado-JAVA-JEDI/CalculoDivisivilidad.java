/*
Cálculo de divisibilidad: Se le solicita que guarden dos números enteros y los
sumen, determine si el primer número es divisible por el segundo número y muestre
el resultado.
 */

import java.util.Scanner;

public class CalculoDivisivilidad {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        int num1 = sn.nextInt();
        System.out.println("Ingrese el segundo número");
        int num2 = sn.nextInt();
        int resultado = num1 + num2;

        String esDivisible = (num2 % num1 == 0)?"SI":"NO"; 

        System.out.printf("El resultado de la suma es %d",resultado);
        System.out.println("");
        System.out.printf("El número %d %s divisible por %d",num2,esDivisible,num1);

        sn.close();

    }
}
