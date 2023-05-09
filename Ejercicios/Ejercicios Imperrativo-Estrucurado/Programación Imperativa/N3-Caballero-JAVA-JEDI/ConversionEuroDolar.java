/*
Conversión de euros a dólares: Escribir un programa en Java que solicite al
usuario una cantidad en euros y muestre el equivalente en dólares, utilizando una
tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 euro = 1.20 dólares, y
el usuario ingresa 100 euros, el programa deberá mostrar 120 dólares.
*/
import java.util.Scanner;
public class ConversionEuroDolar {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        final double ONE_EURO = 0.91;
        System.out.println("Ingrese valor en euros");
        double montoEuro = sn.nextDouble();
        System.out.printf(" %f euros equivalen a US$ %f ", montoEuro, montoEuro * ONE_EURO );        
        sn.close();
    }
}
