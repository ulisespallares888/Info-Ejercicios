/*
Promedio de edad : Guarde en diferentes espacios de memoria distintos valores de
edad y los nombres de esas personas, luego saque su promedio e imprima por
pantalla el nombre de la persona, su edad. Por último imprimir el promedio de sus
edades.
*/
import java.util.Scanner;

public class PromedioDeEdad {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        
        String nombre;
        int edad;

        System.out.println("Ingrese el numero total de personas");
        int nroPersonas = sn.nextInt();


        String[] nombres = new String[nroPersonas];
        int[] edades = new int[nroPersonas];

        for (int i = 0; i < nroPersonas; i++ ){

            System.out.print("Ingrese nombre: ");
            nombre = sn.next();
            nombres[i] = nombre;

            System.out.print("Ingrese edad: ");
            edad = sn.nextInt();
            edades[i] =  edad;            

        }

        double promedioDeEdad = 0.0;

        System.out.println("");
        for (int i = 0; i < nroPersonas; i++) {
            System.out.println("----------------------------");
            System.out.printf("Nombre %s \n",nombres[i]);
            System.out.printf("Edad %d ",edades[i]);
            System.out.println("");
            promedioDeEdad += edades[i];
        }
        promedioDeEdad = promedioDeEdad / nroPersonas;

        System.out.println("----------------------------");
        System.out.printf("El promedio de edades es %f ",promedioDeEdad);

        sn.close();        
    }
}
