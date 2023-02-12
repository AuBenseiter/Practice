package home.myhome.bucle;

import java.util.Scanner;

public class LetraUConAsteriscos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca la altura d ela u: ");
        int altura = s.nextInt();
        //Palos verticales
        for (int i = 1; i < altura; i++) {
            System.out.print("* ");
            for (int j = 2; j < altura; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        //Base u
        System.out.print(" ");
        for (int i = 2; i < altura; i++) {
            System.out.print("* ");
        }
    }
}
