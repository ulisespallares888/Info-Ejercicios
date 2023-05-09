/*
Conversión de grados Celsius a grados Fahrenheit : 
Escribir un programa en
Java que convierta una temperatura en 
grados Celsius a grados Fahrenheit. Buscar
la fórmula con la que se resuelve.
*/
import java.util.Scanner;
public class ConversionCelsiusFahrenheit {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Ingrese los grados en Celsius");
        double gradosCelcius = sn.nextDouble();
        double conversion = gradosCelcius * 1.8 + 32;
        System.out.printf("%f° Celcius equivalena a %f° Fahrenheit ", gradosCelcius, conversion );        
        sn.close();
    }
}
