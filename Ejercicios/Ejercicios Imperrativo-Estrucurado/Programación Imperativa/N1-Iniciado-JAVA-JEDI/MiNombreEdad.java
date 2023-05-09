/*
Mi nombre y edad: Se le solicita que guarde en un espacio de memoria su nombre
y apellido, luego guarde su edad e imprimalos por pantalla.
El mensaje debe tener el siguiente formato:
“Mi nombre es “ {Nombre}
“Mi edad es” {Edad}
*/

import java.util.Scanner;

public class MiNombreEdad {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = sn.nextLine();
        System.out.println("Ingrese su edad");
        int edad = sn.nextInt();

        System.out.printf("Mi nombre es %s \n", nombre);
        System.out.printf("Mi edad es %d ",edad);
        sn.close();
    }
}
