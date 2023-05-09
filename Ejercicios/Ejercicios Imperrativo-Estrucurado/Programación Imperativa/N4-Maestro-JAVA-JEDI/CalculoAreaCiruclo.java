/*
Cálculo del área de un círculo: Escribir un programa en Java que calcule el área
de un círculo con un radio de 5 unidades. Buscar la fórmula con la que se
resuelve.
*/
import java.lang.Math;

public class CalculoAreaCiruclo {
    public static void main(String[] args) {
        final double PI = 3.1415926;
        int radio = 5;
        double superficieCirculo = PI * Math.pow(radio,2);
        System.out.printf("El circulo de radio %d tiene un área de %f", radio, superficieCirculo );  
    }   
}
