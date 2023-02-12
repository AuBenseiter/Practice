package home.myhome.bucle;

import java.util.Scanner;

public class TrianguloHuecoOrientado {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca la altura: ");
        int altura = s.nextInt();
        
        //primera linea
        for (int i = 0; i < altura; i++) {
            System.out.print("*");
        }
        System.out.println();
        
        //parte intermedia
        int espacios = 1;
        for (int i = 1; i < altura -1; i++) {
            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j < altura - i -2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
            espacios++;
        }
        //vertice inferios
        for (int i = 0; i < espacios; i++) {
            System.out.print(" ");
        }
        System.out.println("*");
    }
}
