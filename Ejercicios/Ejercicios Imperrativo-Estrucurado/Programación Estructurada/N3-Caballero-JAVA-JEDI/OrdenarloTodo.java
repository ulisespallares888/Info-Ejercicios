/*
Ordenarlo todo : Realizar un programa que guarde cierta cantidad de números con
punto decimal en un arreglo. Luego, el programa debe ordenar los números de
forma ascendente y mostrarlos en pantalla
*/
import java.util.Arrays;
import java.lang.Math;

public class OrdenarloTodo {
    public static void main(String[] args) {

        int cantValores =(int)(Math.random() * 20 + 1);
        double[] arreglo = new double[cantValores];

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (double)(Math.random() * 100 + 0.1);
        }

        System.out.print("Arreglo antes de ser ordenado \n");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.printf("%.2f; ",arreglo[i]);
        }
        System.out.print("\n");
        
        Arrays.sort(arreglo);

        System.out.print("Arreglo despues de ser ordenado \n");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.printf("%.2f; ",arreglo[i]);
        }
    }
}
