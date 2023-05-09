/*
Menú de opciones : Realice un menú de opciones, donde la opción se guarde en
una variable (Sin pedir por teclado), muestre la opción elegida y fuerce su salida
bucle.
*/

import java.lang.Math;

public class MenuDeOpciones {
    public static void main(String[] args) {
        System.out.println("-----------------------[MENU]-------------------");        
        System.out.println("1:PIZZA");        
        System.out.println("2:EMPANADAS");        
        System.out.println("3:LOMITO");        
        System.out.println("4: HAMBURGUESA");    
        System.out.println("5: SALIR");    
        System.out.println("------------------------------------------------");    
        int eleccion = (int)(Math.random()*6+1);
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
            default:{
                System.out.println("Sólo se aceptan valores del 1 al 5"); 
            }
        }
    }
}
