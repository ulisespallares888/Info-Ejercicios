/*
Mis amigos : Guarde en variables el nombre de N cantidad de amigos, itere sobre
esa cantidad mostrando el nombre de cada amigo.
*/

import java.util.Scanner;

public class MisAmigos {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Ingrese cantidad de amigos \n");
        int cantAmigos = sn.nextInt();
        String[] amigos = new String[cantAmigos];
        String amigo = "";

        for (int i = 0; i < amigos.length; i++) {
            System.out.printf("Ingrese el nombre del amigo N° %d ",i+1);
            amigo = sn.next();
            amigos[i] = amigo;
        }

        for (int i = 0; i < amigos.length; i++) {
            System.out.printf("Amigo N° %d: %s \n",(i+1), amigos[i]);
        }

        sn.close();
    }
}

