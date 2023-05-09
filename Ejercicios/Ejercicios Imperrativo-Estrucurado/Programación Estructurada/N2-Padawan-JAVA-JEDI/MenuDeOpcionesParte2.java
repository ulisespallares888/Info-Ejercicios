/*
Menú de opciones parte 2: Realice un menú de opciones con bucle WHILE, donde
la opción se guarde en una variable (Sin pedir por teclado), muestre la opción
elegida y fuerce su salida bucle.
*/
import java.lang.Math;
public class MenuDeOpcionesParte2 {
    public static void main(String[] args) {
        int eleccion = 0;
        while (eleccion < 5){
            System.out.println("-----------------------[MENU]-------------------");        
            System.out.println("1:PIZZA");        
            System.out.println("2:EMPANADAS");        
            System.out.println("3:LOMITO");        
            System.out.println("4: HAMBURGUESA");    
            System.out.println("5: SALIR");    
            System.out.println("------------------------------------------------");    
            eleccion = (int)(Math.random()*5+1);
            switch (eleccion){
                case 1 : {
                    System.out.println("Eligió PIZZA"); 
                    break;
                }
                case 2 : {
                    System.out.println("Eligió EMPANADAS"); 
                    break;
                }
                case 3 : {
                    System.out.println("Eligió LOMITO"); 
                    break;
                }
                case 4 : {
                    System.out.println("Eligió HAMBURGUESA"); 
                    break;
                }
                case 5 : {
                    System.out.println("Salió del menú"); 
                }
            }
        }
    }
}
