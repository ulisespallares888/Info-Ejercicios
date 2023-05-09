/*
Suma de dos números: Se le solicita que guarden dos números enteros y los
sumen. El resultado mostrarlo por pantalla.
*/

import java.util.Scanner;

public class SumarDosnuemos{

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero:");
        double num1 = sc.nextDouble();
        System.out.println("Ingrese el primer numero:");
        double num2 = sc.nextDouble();

        double resultado = (Double) num1 +  (Double) num2;
        System.out.println(resultado);    
        sc.close();
    }
}


