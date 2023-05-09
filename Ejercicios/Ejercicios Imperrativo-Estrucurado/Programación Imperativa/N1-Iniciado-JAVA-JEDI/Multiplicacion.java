/*
Multiplicación: Se le solicita que guarde dos números reales y los multiplique, luego
guarde otros dos números enteros y multiplicarlos. Guarde en un espacio de
memoria la suma entre estas dos multiplicaciones ¿Que resultado le da? ¿Entero o
real? ¿Por qué?
*/
import java.util.Scanner;

public class Multiplicacion {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        System.out.println("------------[SUMA DE REALES]------------");
        System.out.println("Ingrese el primer número");
        double num1 = sn.nextDouble();
        System.out.println("Ingrese el segundo número");
        double num2 = sn.nextDouble();

        double multiplicacion_double = num1 * num2;

        System.out.println("------------[MULTIPLICACION DE ENTEROS]------------");
        System.out.println("Ingrese el primer número");
        int num3 = sn.nextInt();
        System.out.println("Ingrese el segundo número");
        int num4 = sn.nextInt();        

        int multiplicacion_int = num3 * num4;

        int suma_de_mult_int = (int) (multiplicacion_double + multiplicacion_int);
       
        double suma_de_mult_double = (double) (multiplicacion_double + multiplicacion_int);

        System.out.printf("Resltado casteado a int: %d \n", suma_de_mult_int);
        System.out.printf("Resltado casteado a double: %f \n",suma_de_mult_double);
        System.out.printf("Resultado sin castear %f ", (multiplicacion_double + multiplicacion_int));

        sn.close();
    }
}

/*
La suma nos arroja como resultado un valor real. 
Esto pasa porque tenemos sobre carga en la función suma (+)
con un real y un entero toma ambos valores como reales.
Pero si "castemos" a entero podemos truncar la parte real del resultado.
 */