package home.myhome.bucle;

import java.util.Scanner;

public class TrianguloRellenoOrientado {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca la altura dela figura: ");
        int altura = s.nextInt();
        
        int espacios = 0;
        
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < altura - i; j++) {
                System.out.print("*");
            }
            System.out.println();
            espacios++;
        }
        
    }
}
