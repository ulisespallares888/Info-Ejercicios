/*
Cálculo de la media aritmética:
Escribir un programa en Java que calcule la media aritmética de un conjunto de
números. Utilizar la fórmula: media = (n1 + n2 + ... + nk) / k, donde n1, n2, ..., nk son
los números y k es el número total de elementos. Utilicen variables y constantes
según corresponda. Muestre el resultado por pantalla.
*/
import java.lang.Math;

public class MediaAritmetica {
    public static void main(String[] args) {

        int valoresAleatorios = (int) (Math.random()*100+1);
        int[] arrayValores = new int[valoresAleatorios];
        double acumulador = 0;

        for (int i = 0; i < arrayValores.length; i++) {
            arrayValores[i] = (int)(Math.random()*100+1);
            acumulador += arrayValores[i];
        }
        
        System.out.print("[");
        for (int i = 0; i < arrayValores.length; i++){
            System.out.print(arrayValores[i]+" ");
        }
        System.out.println("] \n");

        System.out.printf("La media aritmetica de estos valores es %f \n", (acumulador / arrayValores.length));
    }
}
