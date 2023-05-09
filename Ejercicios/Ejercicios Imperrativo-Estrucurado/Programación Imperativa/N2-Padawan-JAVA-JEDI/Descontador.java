/*
Descontador: Se le solicita que guarde un número en un espacio de memoria y
discretamente dicho número 20 veces sin usar asignación. ¿Que operador podría
usar para hacerlo?
*/
import java.util.Scanner;

public class Descontador {
    
        public static void main(String[] args) {
            Scanner sn = new Scanner(System.in);
            System.out.println("Ingrese un número");
            int numero = sn.nextInt();
            int resultado = numero;
    
            for(int i = 1; i <= 20 ; i++){
                resultado--;
            }
            System.out.printf("El resulado es %d", resultado);
            sn.close();
        }   
    }