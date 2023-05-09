/*
Espero aprobar : Escribe un programa que imprima un título para el programa,
luego un listado (Seguido, NO con saltos de línea) de las N notas de mis exámenes,
donde los N números son guardados en variables o constantes según corresponda.
Luego obtenga el promedio de esas calificaciones y me diga si aprobé o no y con
cuanto
*/

import java.lang.Math;

public class EsperoAprobar {
    public static void main(String[] args) {
        int nroNotas = (int) (Math.random()*10+1);
        int[] notas = new int[nroNotas];
        double promedioNotas = 0;
        for (int i = 0; i < nroNotas; i++){
            notas[i] = (int)(Math.random()*100+1);
            promedioNotas += notas[i]; 
        }

        System.out.print("Listado de notas: ");
        for(int i=0; i<notas.length; i++){
            System.out.print(notas[i]+",");
        }
        
        promedioNotas = promedioNotas/nroNotas;

        System.out.printf("Promedio de las notas es %f.", promedioNotas);

        if (promedioNotas >= 60){
            System.out.printf("El alumno aprobó con %f.", promedioNotas);
        } 
        else{
             System.out.printf("El alumno desaprobó con %f.", promedioNotas);
        }
    }
}

