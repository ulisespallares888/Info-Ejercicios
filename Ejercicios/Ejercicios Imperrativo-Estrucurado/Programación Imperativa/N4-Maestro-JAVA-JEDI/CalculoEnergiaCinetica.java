/*
Cálculo de la energía cinética:
Escribir un programa en Java que calcule la energía cinética de un objeto en
movimiento, dados su masa y su velocidad.
Utilizar la fórmula: E = (1/2) * m * v^2, donde E es la energía cinética, m es la masa
del objeto y v es la velocidad. Muestre el resultado por pantalla.
*/
import java.lang.Math;
import java.util.Scanner;
public class CalculoEnergiaCinetica {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Ingrese la masa del objeto en kilogramos");
        double masa = sn.nextDouble();
        System.out.println("Ingrese la velocidad del objeto en metros por segundo3");
        double velocidad = sn.nextDouble();
        
        double energiaCinetica = 0.5 * masa * Math.pow(velocidad, 2);

        System.out.printf("La energía cinética del objeto es %f Joules [kg*(m/s)^2]", energiaCinetica);
        sn.close();
    }
}
