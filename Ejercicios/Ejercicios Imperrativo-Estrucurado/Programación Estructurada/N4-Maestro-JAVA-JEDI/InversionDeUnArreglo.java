/*
Inversión de un arreglo: Dado un arreglo de enteros inviertalo, de tal manera que
el primer elemento ahora sea el último y así sucesivamente.
*/

public class InversionDeUnArreglo {
    public static void main(String[] args) {
        int[] arreglo = {1,2,3,4,5,6,7,8,9,10};
        int auxiliarValue = 0;
        System.out.println("Arreglo antes de ser invertido");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]+",");
        }
        System.out.println("");

        for (int i = 0, j=arreglo.length -1; i < arreglo.length / 2 && j > 0; i++, j--) {
            auxiliarValue = arreglo[i];
            arreglo[i] = arreglo[j];
            arreglo[j] = auxiliarValue;
        }

        System.out.println("Arreglo despues de ser invertido");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]+",");
        }
    }
}
