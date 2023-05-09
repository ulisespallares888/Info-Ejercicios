/*
Caracteres : Guarde en distintos espacios de memoria los caracteres de su nombre
en unicode y luego imprimirlos por pantalla. ¿Por qué no puede usar "" en el char?
¿Qué es unicode? 
*/


import java.util.Scanner;

public class CaracteresPadawan {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        char[][] abecedarioUnicode = {
            {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 
             'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'},
            {'\u0061', '\u0062', '\u0063', '\u0064', '\u0065', '\u0066', '\u0067', '\u0068', '\u0069', '\u006A', '\u006B', '\u006C', '\u006D',
             '\u006E', '\u006F', '\u0070', '\u0071', '\u0072', '\u0073', '\u0074', '\u0075', '\u0076', '\u0077', '\u0078', '\u0079', '\u007A'}
        };

        System.out.println("Ingrese su nombre");
        String nombre = sn.nextLine().toLowerCase();
        char[] nombre_array = nombre.toCharArray();
        char[] nombreUnicode = new char[nombre_array.length];
        
        for (int i = 0; i < nombre_array.length; i++) {
            for (int j = 0; j < abecedarioUnicode[0].length; j++){
                if (nombre_array[i] == abecedarioUnicode[0][j] ){
                    nombreUnicode[i] = abecedarioUnicode[1][j];
                }
            }
        }

        System.out.print("Su nombre en unicode es ");
        for (int k = 0; k < nombreUnicode.length; k++){
            System.out.printf("%s ",nombreUnicode[k]);
        }
        
        sn.close();
    }
}
