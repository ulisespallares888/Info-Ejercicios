/*
Conversión de libras esterlinas a dólares: Escribir un programa en Java que
solicite al usuario una cantidad en libras esterlinas y muestre el equivalente en
dólares, utilizando una tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1
libra esterlina = 1.40 dólares, y el usuario ingresa 50 libras esterlinas, el programa
deberá mostrar 70 dólares.
*/
import java.util.Scanner;
public class ConversionLibrasEstDolar {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        final double ONE_LIBRA_ESTERLINA = 1.25;
        System.out.println("Ingrese valor en libras esterlinas");
        double montolibraEsterlina = sn.nextDouble();
        System.out.printf("£ %f equivalen a US$ %f ", montolibraEsterlina, montolibraEsterlina * ONE_LIBRA_ESTERLINA );        
        sn.close();
    }
}
