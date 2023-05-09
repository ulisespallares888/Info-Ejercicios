
/*
Conversión de pesos a euros: Escribir un programa en Java que solicite al usuario
una cantidad en pesos y muestre el equivalente en euros, utilizando una tasa de
cambio fija. Por ejemplo, si la tasa de cambio es de 1 euro = 20 pesos, y el usuario
ingresa 5000 pesos, el programa deberá mostrar 250 euros.
*/
import java.util.Scanner;
public class ConversionPesoEuro {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        final double ONE_PESO = 0.0042;
        System.out.println("Ingrese valor en pesos");
        double montoPesos = sn.nextDouble();
        System.out.printf("$ %f equivalen a %f euros ", montoPesos, montoPesos * ONE_PESO );        
        sn.close();
    }
}
