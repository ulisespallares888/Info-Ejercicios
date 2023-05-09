/*
Triangulo de asteriscos : Se le solicita que creen un programa que imprima un
triángulo de asteriscos en la consola. Usar bucles.*/

import java.util.Scanner;

public class TrianguloDeAsteriscos{
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Ingrese altura del triangulo");
        int altura = sn.nextInt();
        String nivel = "";
        for (int i = 1; i <= altura ; i++) {
            nivel += "*";
            System.out.println(nivel);
        }   
        sn.close();
    }
}