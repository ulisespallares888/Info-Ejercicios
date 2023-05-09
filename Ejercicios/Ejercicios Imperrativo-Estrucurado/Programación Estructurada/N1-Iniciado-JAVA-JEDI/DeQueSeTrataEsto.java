/*
De que se trata esto? : Realizar un programa que guarde un número en memoria y
determine si es positivo, negativo o cero.
*/
import java.util.Scanner;

public class DeQueSeTrataEsto {
    public static void main(String[] args) {
        
        Scanner sn = new Scanner(System.in);
        System.out.print("Ingrese número \n");
        double numero = sn.nextDouble();

        if (numero < 0) {
            System.out.printf("El número es negativo");
        }
        else if (numero > 0 ) {
            System.out.printf("El número es positivo");
        }else{
            System.out.printf("El número es cero");
        }
        sn.close();
    }
}
