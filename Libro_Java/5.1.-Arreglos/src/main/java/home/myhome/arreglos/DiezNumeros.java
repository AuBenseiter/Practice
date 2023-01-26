package home.myhome.arreglos;

import java.util.Scanner;

public class DiezNumeros {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] n = new int[10];
        
        System.out.println("Introduzca 10 numeros enteros, recuerda precionar enter e introducir el siguiente");
        for (int i = 0; i < 10; i++) {
            n[i] = s.nextInt();
        }
        System.out.println("Los numeros introducido, al reves, so los siguientes:");
        for (int i = 9; i >= 0; i--) {
            System.out.println(n[i] );
        }
    }
}
