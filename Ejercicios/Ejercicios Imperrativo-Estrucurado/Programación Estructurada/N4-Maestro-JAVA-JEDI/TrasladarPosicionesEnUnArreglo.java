/*
Trasladar posiciones en un arreglo: Dado un arreglo de enteros, una posición del
arreglo y la cantidad de N traslados a hacer en un arreglo. Lo que debe hacer es
tomar el elemento de la posición del arreglo y trasladarlo N cantidad de veces, si el
traslado es mayor al tamaño del arreglo informar por pantalla.
*/
import java.lang.Math;
public class TrasladarPosicionesEnUnArreglo {
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int posicion = (int)(Math.random() * arreglo.length );
        int traslados = posicion + (int)(Math.random() * arreglo.length) ;
        int[] arregloAux = new int [arreglo.length];
        System.out.println();
        if ((posicion + traslados) >= arreglo.length){
            System.out.println("No es posible realizar el traslado!");
        }
        else{
            int cont = 0;
            int cont2 = 0;
            while (cont < arreglo.length){
                if (cont != posicion){
                    arregloAux[cont] = arreglo[cont];
                }
                else{
                    cont2 = cont +1;
                    while(cont2 <= (traslados+posicion + 1)){
                        arregloAux[cont] = arreglo[cont2];
                        cont += 1;
                        cont2 += 1;
                    }
                    arregloAux[cont-1] = arreglo[posicion];  
                    cont -= 1;           
                }
                cont += 1; 
            }
            System.out.println("Posición: " + posicion); 
            System.out.println("Translado: " + traslados); 
            System.out.println("Arreglo " ); 
            for (int i = 0; i < arreglo.length; i++){
                System.out.print(arreglo[i] + ","); 
            }
            System.out.println("" ); 
            System.out.println("ArregloAux " ); 
            for (int i = 0; i < arregloAux.length; i++){
                System.out.print(arregloAux[i] + ","); 
            }
        }         
    }
}
