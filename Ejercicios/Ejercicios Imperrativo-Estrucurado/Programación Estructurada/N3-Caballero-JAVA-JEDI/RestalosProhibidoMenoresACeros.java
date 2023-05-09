/*
Restalos, prohibido menores a ceros : Cree dos arreglos con números decimales,
luego recortarlos y reste ambos arreglos el resultado aplicarlos a un tercer arreglo, si
la resta da negativo entonces guarde 0.
*/
import java.lang.Math;
public class RestalosProhibidoMenoresACeros {
    public static void main(String[] args) {
        int longitud = (int)(Math.random() * 20 + 1);
        double[] arreglo1 = new double[longitud];
        double[] arreglo2 = new double[longitud];
        double[] arregloResultado = new double[longitud];

        for (int i = 0; i < arreglo1.length; i++){
            arreglo1[i] =(double)(Math.random() * 100 + 0.1); 
            arreglo2[i] =(double)(Math.random() * 100 + 0.1); 
            arregloResultado[i] = ((arreglo1[i] - arreglo2[i]) < 0)? 0 : arreglo1[i] - arreglo2[i];
        }

        System.out.println("Primer arreglo"); 
        for (int i = 0; i < arreglo1.length; i++){
            System.out.printf("%.2f; ",arreglo1[i]); 
        }
        System.out.println("\n"); 

        System.out.println("Segundo arreglo "); 
        for (int i = 0; i < arreglo1.length; i++){
            System.out.printf("%.2f; ",arreglo2[i]); 
        }
        System.out.println("\n"); 

        System.out.println("Arreglo de resultados "); 
        for (int i = 0; i < arreglo1.length; i++){
            System.out.printf("%.2f; ",arregloResultado[i]);
        }       
    }
}
