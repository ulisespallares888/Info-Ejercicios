/*
Sera Palíndromo?: Dado un arreglo con caracteres (Formando una palabra) indicar
si es o no palíndromo.
*/

public class SeraPalíndromo {
    public static void main(String[] args) {
        //char[] palabraNORMAL  = {'P','R','O','G','R','A','M','A','C','I','O','N'};
        char[] palabranPalindromo  = {'S','O','M','O','S'};
        char[] palabra = palabranPalindromo;
        boolean band = true;

        for (int i = 0, j = palabra.length -1; i < (palabra.length+1) / 2 && j > 0; i++, j--) {
            if (palabra[i] != palabra[j]) {
                band = false;
            }
        }

        if (band) {
            System.out.println("Es un palindromo");
        }
        else{
            System.out.println("No es un palindromo");
        }
    }
}
