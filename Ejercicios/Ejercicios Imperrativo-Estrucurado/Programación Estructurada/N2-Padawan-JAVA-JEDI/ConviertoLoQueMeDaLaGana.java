/*
Convierto lo que me da la gana: Demuestre cómo convertir un bucle WHILE en un
DO WHILE.
*/

/*
 * Podemos construir un DO-WHILE a partir de un WHILE introduciando
 * una variable boleana (band) en el valor de true en el ual si o si tenga 
 * que entrar en el ciclo de manara forzada almenos una vez
 */

public class ConviertoLoQueMeDaLaGana {
    public static void main(String[] args) {
        Boolean band = true;
        int contador = 0;

        while(band && contador < 1 ){
            System.out.println("Soy un DO-WHILE");
            contador += 1;
        }

        while(contador  > 1 ){
            System.out.println("Soy un WHILE");
        }
    }
}
