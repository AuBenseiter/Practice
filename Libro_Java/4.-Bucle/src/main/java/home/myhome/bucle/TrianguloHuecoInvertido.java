package home.myhome.bucle;

import java.util.Scanner;

public class TrianguloHuecoInvertido {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca la altura de la figura: ");
        int altura = s.nextInt();
        
        //primera linea///////////////
        for (int i = 0; i < altura; i++) {
            System.out.print("*");
        }
        System.out.println();
        
        //parte intermedia
        for (int i = 1; i < altura -1; i++) {
            System.out.print("*");
            for (int j = 0; j < altura - i - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        //vertice inferio
        System.out.println("*");
    }
}
