/*
Cálculo de la hipotenusa de un triángulo:
Escribir un programa en Java que calcule la hipotenusa de un triángulo rectángulo,
dados los valores de los catetos. Utilizar la fórmula: h^2 = a^2 + b^2, donde h es la
hipotenusa, a y b son los catetos.
*/

import java.lang.Math;
import java.util.Scanner;
public class CalculoHipotenusa {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Ingrese el primer cateto");
        double catetoA = sn.nextDouble();
        System.out.println("Ingrese el segundo cateto");
        double catetoB = sn.nextDouble();
        double hipotenusa = Math.hypot(catetoA,catetoB); 
        System.out.printf("La hipotenusa mide %f", hipotenusa);
        sn.close();
    }
}
