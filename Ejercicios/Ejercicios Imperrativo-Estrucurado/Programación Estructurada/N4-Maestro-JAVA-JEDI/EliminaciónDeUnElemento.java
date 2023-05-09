/*
Eliminación de un elemento: Dado un arreglo con valores enteros, realice la
búsqueda de ese entero y si lo encuentra eliminarlo, si no lo encuentra informe por
pantalla.
*/
import java.lang.Math;

public class EliminaciónDeUnElemento {
    public static void main(String[] args) {
        int cantValores = (int)(Math.random() * 20 );
        int[] arreglo = new int[cantValores];
        int[] nuevoArreglo = new int[arreglo.length - 1];
        int valorBuscar = (int)(Math.random() * 20 );
        boolean band = false;
        boolean band2 = false;

        System.out.println("Antes de eliminar el valor");
        for (int i = 0; i < arreglo.length; i++){
            arreglo[i] = (int)(Math.random() * 20 );
            System.out.print(arreglo[i] + ",");
        }
        System.out.print("\n");
        System.out.printf("Elemnto a buscar %d\n",valorBuscar);

        for (int i = 0; i < arreglo.length; i++){
            if (arreglo[i] == valorBuscar){
                band = true;
                break;
            } 
        }
        
        if (band){
            System.out.print("Elemento encontrado\n");

            for (int i = 0; i < nuevoArreglo.length; i++){
                if (band2 == false && arreglo[i] != valorBuscar){
                    nuevoArreglo[i] = arreglo[i];
                    } 
                    else {
                        band2 = true;
                        nuevoArreglo[i] = arreglo[i+1];
                        }
                if(i == nuevoArreglo.length - 1 && band2){
                    nuevoArreglo[i] = arreglo[i+1];
                }
            } 

            System.out.println("Después de eliminar el valor");
            for (int i = 0; i < nuevoArreglo.length; i++){
                System.out.print(nuevoArreglo[i] + ",");
            }
        } 
        
        else {
            System.out.print("Elemento no encontrado\n");
        }       
    }
}
