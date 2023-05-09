/*
Mis amigos y su edad: Guarda en variables el nombre de N cantidad de amigos,
itere sobre esa cantidad luego muestre el nombre de cada amigo si y sólo si este
amigo es mayor de edad, en caso de ser menor de edad imprima un mensaje
diciendole a ese amigo porque no lo muestra por pantalla
*/
import java.util.Scanner;

public class MisAmigosYSuEdad {
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

        for (int i = 0; i < amigos.length ; i++) {
            if (edades[i] < 18){
                System.out.printf("El nombre del migo N° %d no puede mostrarse por ser menor de edad \n",(i+1));
            }else{
                System.out.printf("Amigo N° %d: %s \n",(i+1), amigos[i]);
            }
        }

        sn.close();
    }
}
