package home.myhome.bucle;

import java.util.Scanner;

public class PiramidesRellenas {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca la altura de la primera piramide");
        int alturaP1 = s.nextInt();

        System.out.println("Introduzca la altura de la segunda piramide");
        int alturaP2 = s.nextInt();

        int alturaMaxima = Math.max(alturaP1, alturaP2);
        int espaciosP1 = alturaP1 - 1;
        int espaciosP2 = alturaP2 - 1;
        int baseP1 = alturaP1 * 2 - 1;
        int baseP2 = alturaP2 * 2 - 1;
        int asteriscosP1 = 1;
        int asteriscosP2 = 1;

        for (int i = alturaMaxima; i > 0; i--) {

            // Pirámide 1
            if (i > alturaP1) {
                // Si la pirámide 1 queda por debajo, pinta el hueco.
                for (int j = 0; j <= baseP1; j++) {
                    System.out.print(" ");
                }
            } else {
                // Espacios por delante de la pirámide 1
                for (int j = 0; j < espaciosP1; j++) {
                    System.out.print(" ");
                }

                // Pirámide 1
                for (int j = 0; j < asteriscosP1; j++) {
                    System.out.print("*");
                }

                // Espacios por detrás de la pirámide 1
                for (int j = 0; j <= espaciosP1; j++) {
                    System.out.print(" ");
                }

                espaciosP1--;
                asteriscosP1 += 2;
            }

            // Pirámide 2
            if (i > alturaP2) {
                // Si la pirámide 2 queda por debajo, pinta el hueco.
                for (int j = 0; j < baseP2; j++) {
                    System.out.print(" ");
                }
            } else {
                // Espacios por delante de la pirámide 1
                for (int j = 0; j < espaciosP2; j++) {
                    System.out.print(" ");
                }

                // Pirámide 1
                for (int j = 0; j < asteriscosP2; j++) {
                    System.out.print("*");
                }

                // Espacios por detrás de la pirámide 1
                for (int j = 0; j <= espaciosP1; j++) {
                    System.out.print(" ");
                }

                espaciosP2--;
                asteriscosP2 += 2;
            }
            System.out.println();
        }
    }
}
