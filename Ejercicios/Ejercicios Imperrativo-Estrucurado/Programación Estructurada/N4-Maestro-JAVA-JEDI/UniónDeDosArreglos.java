/*
Unión de dos arreglos : Dado dos arreglos con cualquier tipo de valor (Ya sea
String, Char, Integer, etc), realice la unión de ambos arreglos en un tercer arreglo.
*/

import java.util.ArrayList;

public class UniónDeDosArreglos {
    public static void main(String[] args) {
        int[] arreglo1 = {1,2,3,4,5,6};
        String[] arreglo2 = {"amaca", "balon", "carne", "dedo", "enano", "flota"};
        ArrayList<Object> arregloResultado = new ArrayList<Object>();

        for (int i = 0; i < arreglo1.length; i++){
            arregloResultado.add(arreglo1[i]); 
        }
        
        for (int i = 0; i < arreglo1.length; i++){
            arregloResultado.add(arreglo2[i]); 
        }

        arregloResultado.remove("flota"); 
        
        for (Object elemento : arregloResultado) {
            System.out.println(elemento);
        }
    }
}
