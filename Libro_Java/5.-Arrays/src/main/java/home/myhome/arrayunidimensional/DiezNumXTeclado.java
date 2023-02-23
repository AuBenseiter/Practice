package home.myhome.arrayunidimensional;

import java.util.Scanner;

public class DiezNumXTeclado {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int[] n = new int[10];
        
        System.out.println("Introduzca 10 numeros enteros");
        
        for (int i = 0; i < 10; i++) {
            n[i] = s.nextInt();
        }
        System.out.println("\nLos numeros introducidos son: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(n[i] + " ");
        }
        System.out.println("\n Los numeros introducidos al revez son los siguientes: ");
        for (int i = 9; i >= 0; i--) {
            System.out.print(n[i] + " ");
        }
    }
}
