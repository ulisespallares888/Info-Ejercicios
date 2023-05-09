/*
Dame los mayores y los menores : Realizar un programa donde se guarden 5 en
un arreglo. Luego, el programa debe mostrar en pantalla el valor máximo y mínimo
de los números ingresados
*/
import java.util.Scanner;
public class DameLosMayoresYLosMenores2 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int[] arreglo = new int[5];

        for (int i = 0; i < arreglo.length; i++){
            System.out.println("Ingrese el número");
            arreglo[i] = sn.nextInt();
        }

        int max = arreglo[0];
        int min = arreglo[0];

        for (int i = 0; i < arreglo.length; i++){
            max = (arreglo[i]>max)?arreglo[i]:max;
            min = (arreglo[i]<min)?arreglo[i]:min;
        }

        System.out.println();
        System.out.printf("El mayor valor del arreglo es %d \n", max);
        System.out.printf("El menor valor del arreglo es %d \n", min);

        sn.close();
    }
}
