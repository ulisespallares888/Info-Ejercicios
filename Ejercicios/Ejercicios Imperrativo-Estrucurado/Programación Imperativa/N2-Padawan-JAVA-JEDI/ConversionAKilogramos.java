/*
Conversión a kilogramos: Guarde en un espacio de memoria sus libras y luego, en
otro espacio de memoria realice la conversión de esas libras a kilogramos. Utilice
una constante de los valores que no van a cambiar en esta conversión. Muestre el
resultado por pantalla
*/

import java.util.Scanner;

public class ConversionAKilogramos{
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        
        final double ONE_LIBRA  = 0.453592;

        System.out.println("Ingrese un valor en libras");
        double valorLibras = sn.nextDouble();
        double conversion = valorLibras*ONE_LIBRA;
        System.out.printf("%f libras equivalen a %f kilos", valorLibras,conversion);
        sn.close();
    }
}