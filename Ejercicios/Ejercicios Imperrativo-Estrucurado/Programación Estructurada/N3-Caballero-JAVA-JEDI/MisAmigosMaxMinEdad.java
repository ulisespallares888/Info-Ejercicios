/*
Mis amigos, su edad y el mayor : Guarda en un arreglo una N cantidad de amigos,
itere sobre esa cantidad mostrando el nombre de cada amigo si y sólo si este amigo
es mayor de edad, en caso de ser menor de edad imprima un mensaje diciendole a
ese amigo porque no lo muestra por pantalla. Pero a su vez, encuentre al amigo que
mayor edad tenga, muestre un mensaje por pantalla del nombre de esa persona y su
edad.
*/
import java.util.Scanner;

public class MisAmigosMaxMinEdad {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Ingrese cantidad de amigos \n");
        int cantAmigos = sn.nextInt();

        String[] amigos = new String[cantAmigos];
        int[] edades = new int[cantAmigos];

        String amigo = "";
        int edad = 0;
        

        for (int i = 0; i < cantAmigos; i++) {
            System.out.printf("Ingrese el nombre del amigo N° %d ",i+1);
            amigo = sn.next();
            amigos[i] = amigo;
            System.out.printf("Ingrese el edad del amigo N° %d ",i+1);
            edad = sn.nextInt();
            edades[i] = edad;
        }

        int maxEdad = edades[0];
        int indice = 0;

        for (int i = 0; i < amigos.length ; i++) {
            if (edades[i] < 18){
                System.out.printf("El nombre del migo N° %d no puede mostrarse por ser menor de edad \n",(i+1));
            }else{
                System.out.printf("Amigo N° %d: %s \n",(i+1), amigos[i]);
            }

            if (edades[i] > maxEdad){
                maxEdad = edades[i];
                indice = i;
            }
        }

        System.out.printf("El amigo más grande de edad es %s y tiene %d años. \n",amigos[indice], maxEdad);

        sn.close();
    
    }
}
