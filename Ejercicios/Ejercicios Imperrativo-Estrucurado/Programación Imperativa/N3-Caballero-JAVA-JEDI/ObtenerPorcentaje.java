/*
Obtener porcentaje : Dados dos números, uno real y el otro entero. Obtenga el
porcentaje que indique el segundo número del primer número.
*/
import java.util.Scanner;

public class ObtenerPorcentaje {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Ingrese número real");
        double real = sn.nextDouble();
        System.out.println("Ingrese número entero");
        int entero = sn.nextInt();

        double Porcentaje = (entero / real) * 100;
        
        System.out.printf("El número %d es un %f%% del número %f", entero,Porcentaje,real);
        sn.close();
    }
}
