/*
Cálculo de la velocidad final: Escribir un programa en Java que calcule la velocidad final de un objeto en caída
libre, dados su velocidad inicial, la aceleración de la gravedad y el tiempo
transcurrido. Utilizar la fórmula: v_f = v_i + g * t, donde v_f es la velocidad final, v_i
es la velocidad inicial, g es la aceleración de la gravedad y t es el tiempo transcurrido.
Muestre el resultado por pantalla.
*/

import java.util.Scanner;

public class CalculoVelocidadFinal {
    public static void main(String[] args) {
        final double ACELERACION_DE_LA_GRAVEDAD_TIERRA = 9.807;
        Scanner sn = new Scanner(System.in);
        
        System.out.println("Ingrese la velocidad inicial en metros por segundo");
        double velocidadInicial = sn.nextDouble();
        System.out.println("Ingrese el tiempo trascurrido en segundos");
        double tiempo = sn.nextDouble();

        double velocidadFinal = velocidadInicial + ACELERACION_DE_LA_GRAVEDAD_TIERRA * tiempo;

        System.out.printf("La velocidad final es de %f m/s", velocidadFinal);

        sn.close();
    }
}
