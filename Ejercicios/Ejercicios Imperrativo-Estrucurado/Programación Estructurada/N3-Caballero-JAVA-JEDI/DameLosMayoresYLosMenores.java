/*
Dame los mayores y los menores : Dado un arreglo con valores enteros, realice la
búsqueda de ese entero, si encontró el entero mostrarlo por pantalla sino muestre
por pantalla que no lo encontró.
*/

public class DameLosMayoresYLosMenores {
    public static void main(String[] args) {
        int cantValores = (int)(Math.random() * 100 + 1);
        int[] arreglo = new int[cantValores];
        
        for (int i = 0; i < arreglo.length; i++){
            arreglo[i] = (int)(Math.random() * 100 + 1);
        }

        int max = arreglo[0];
        int min = arreglo[0];

        for (int i = 0; i < arreglo.length; i++){

            max = (arreglo[i]>max)?arreglo[i]:max;
            min = (arreglo[i]<min)?arreglo[i]:min;
        }
        System.out.println();
        for (int i = 0; i < arreglo.length; i++){
            System.out.print(arreglo[i] + ",");
        }
        System.out.println();
        System.out.printf("El mayor valor del arreglo es %d \n", max);
        System.out.printf("El menor valor del arreglo es %d \n", min);
    }
}
