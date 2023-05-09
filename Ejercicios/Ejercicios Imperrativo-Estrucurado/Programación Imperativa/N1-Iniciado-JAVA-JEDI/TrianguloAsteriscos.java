/*
Triangulo de asteriscos : Se le solicita que creen un programa que imprima un
triángulo de asteriscos en la consola.
 */
import java.util.Scanner;
public class TrianguloAsteriscos {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Ingrese la altura del triangulo");
        int numero = sn.nextInt();
        for (int i = 0; i < numero; i++) {
            for (int j = numero; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }   
        sn.close();
    }
}



