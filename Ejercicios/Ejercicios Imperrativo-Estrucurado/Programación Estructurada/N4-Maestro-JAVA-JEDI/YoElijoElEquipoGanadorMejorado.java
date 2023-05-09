/*
Yo elijo el equipo ganador mejorado: A partir del ejercicio número 12 del nivel de
Padawan Jedi mejorelo usando arreglos.
"12. Yo elijo el equipo ganador : Modifique el ejercicio anterior en donde usted debe
crear un menú de opciones en donde en ese menú de opciones debe elegir qué
equipo de fútbol quiere saber la información del el ejercicio 11."
*/

import java.util.Scanner;
public class YoElijoElEquipoGanadorMejorado {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        String[] boca = {"Boca","Hugo Ibarra","Palermo", "Riquelme"};
        String[] river = {"River","Gallardo","Martinez", "Sosa"};
           
        System.out.println("-----------------------[MENU]-------------------");        
        System.out.println("1:Boca");        
        System.out.println("2:River");          
        System.out.println("------------------------------------------------");    
        
        System.out.print("Ingrese club \n");
        int eleccion = sn.nextInt();
        switch (eleccion){
            case 1 : {
                System.out.println("Nombre: " + boca[0]);
                System.out.println("Entrenador: " + boca[1]);
                System.out.println("Jugadores: ");
                for (int i = 2; i < boca.length; i++){
                    System.out.println( "-" + boca[i]);
                }
                break;
            }
            case 2 : {
                System.out.println("------------------- ");
                System.out.println("Nombre: " + river[0]);
                System.out.println("Entrenador: " + river[1]);
                System.out.println("Jugadores: "); 
                for (int i = 2; i < river.length; i++){
                    System.out.println("-" + river[i]);
                }
                break;
            }
            default :{
                System.out.println("Su eleccion no esta en el menú"); 
            }
        }
        sn.close();
    }
}
