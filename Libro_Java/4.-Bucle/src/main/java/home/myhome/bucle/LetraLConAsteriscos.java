package home.myhome.bucle;

import java.util.Scanner;

public class LetraLConAsteriscos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca la altura de la L: ");
        int altura = s.nextInt();
        
        for (int i = 1; i < altura; i++) {
            System.out.println("*");
        }
        for (int i = 0; i < altura/2+1; i++) {
            System.out.print("* ");
        }
    }
}
