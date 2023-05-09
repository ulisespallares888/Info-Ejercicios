/*
Potencia de 2 y 3: Se le solicita que guarde en un espacio de memoria un número y
luego haga la potencia de ese número al cuadrado y al cubo.
*/
import java.util.Scanner;
import java.lang.Math;
public class Potencia {
    
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Ingrese el número");
        double numero = sn.nextDouble();
        double cuadrado = Math.pow(numero, 2);
        double cubo = Math.pow(numero,3);
        System.out.printf("El número %f elevado al %d es: %f \n", numero, 2, cuadrado);
        System.out.printf("El número %f elevado al %d es: %f \n", numero, 3, cubo);
        sn.close();
    }
}
