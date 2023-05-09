/*
Conversión de dólares a pesos: Escribir un programa en Java que solicite al
usuario una cantidad en dólares y muestre el equivalente en pesos, utilizando una
tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 dólar = 20 pesos, y el
usuario ingresa 50 dólares, el programa deberá mostrar 1000 pesos.
 */

import java.util.Scanner;

 public class ConversionDolarPeso {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        final double ONE_DOLAR = 400.00;
        System.out.println("Ingrese valor en dólares");
        double montoDolar = sn.nextDouble();
        System.out.printf("US$ %f equivalen a $ %f ", montoDolar, montoDolar * ONE_DOLAR );        
        sn.close();
    }
}
