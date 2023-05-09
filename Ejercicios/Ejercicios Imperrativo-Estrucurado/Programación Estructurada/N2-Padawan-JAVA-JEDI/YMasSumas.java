/*
Y mas… sumas! : Realizar un programa donde se guarde un número entero en una
variable y que imprima por pantalla el resultado de la suma de todos los números
enteros desde 1 hasta ese número.
*/
import java.util.Scanner;
public class YMasSumas {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Ingrese el número \n");
        int numero = sn.nextInt();
        int suma = 0;
        for (int i = 1; i <= numero; i++){
            suma += i;
        }
        System.out.printf("La suma de todos los valores anteriores a %d es %d. \n", numero, suma);
        sn.close();;
        
    }
}
