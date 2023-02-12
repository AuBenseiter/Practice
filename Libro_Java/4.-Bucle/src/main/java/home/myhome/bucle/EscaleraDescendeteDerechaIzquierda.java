package home.myhome.bucle;

import java.util.Scanner;

public class EscaleraDescendeteDerechaIzquierda {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduzca el numero de escalones: ");
        int escalones = s.nextInt();
        
        System.out.println("Introduzca la altura de cada escalon: ");
        int alturaEscalon = s.nextInt();
        
        for (int i = 1; i <= escalones; i++) {
            for (int j = 1; j < alturaEscalon; j++) {
                for (int k = 0; k < i; k++) {
                    System.out.print("*****");
                }
                System.out.println();
            }
        }
    }
}
