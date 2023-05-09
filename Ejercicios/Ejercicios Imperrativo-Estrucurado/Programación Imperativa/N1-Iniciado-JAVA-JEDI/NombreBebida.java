/*
Nombre de bebida: Se le solicita que guarde en espacios de memoria distinta la
información de: El nombre de su última mascota y nombre de la última película
vista. Por último mostrarlo por pantalla con el siguiente formato:
“Nombre de la próxima bebida : ” {Nombre de mascota} {Nombre de pelicula}
*/
import java.util.Scanner;

public class NombreBebida {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Ingrese nombre de su mascota");
        String mascota = sn.nextLine();
        System.out.println("Ingrese nombre de la última película vista");
        String pelicula = sn.nextLine();
        System.out.printf("Nombre de la proxima bebida: %s %s",mascota,pelicula);
        sn.close();
    }
}
