/*
Cálculo de la fuerza centrípeta:
Escribir un programa en Java que calcule la fuerza centrípeta necesaria para
mantener un objeto en una trayectoria circular, dados su masa, la velocidad angular
y el radio de la trayectoria. Utilizar la fórmula: F_c = m * v^2 / r, donde F_c es la 
fuerza centrípeta, m es la masa del objeto, v es la velocidad angular y r es el radio de la trayectoria.
Muestre el resultado por pantalla.
*/
import java.lang.Math;
import java.util.Scanner;
public class CalculoFuerzaCentripeta {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Ingrese la masa del objeto en kilogramos");
        double masa = sn.nextDouble();
        System.out.println("Ingrese la velocidad angular del objeto en metros por segundo");
        double velocidadAngular = sn.nextDouble();
        System.out.println("Ingrese el el radio de la trayectoria en metros");
        double radioTrayectoria  = sn.nextDouble();

        double fuerzaCentripeta =  masa * Math.pow(velocidadAngular, 2) / radioTrayectoria;

        System.out.printf("La fuerza centrípeta necesaria para mantener un objeto de %f kg en una trayectoria circular de %f mts radio y con una velodidad angular de %f m/s es de %f Nw", masa, radioTrayectoria, velocidadAngular, fuerzaCentripeta);
                
        sn.close();
    }
}
