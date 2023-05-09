/*
Conversión de bitcoins a dólares: Escribir un programa en Java que solicite al
usuario una cantidad en bitcoins y muestre el equivalente en dólares, utilizando una
tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 bitcoin = 50000
dólares, y el usuario ingresa 0.5 bitcoins, el programa deberá mostrar 25000 dólares.
*/
import java.util.Scanner;

public class ConversonBitconDolar {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        final double ONE_BITCOIN = 27480.20;
        System.out.println("Ingrese valor en dolares");
        double montoDolares = sn.nextDouble();
        System.out.printf("%f bitcoins equivalen a %f dolares ", montoDolares, montoDolares * ONE_BITCOIN );        
        sn.close();
        
    }
}
