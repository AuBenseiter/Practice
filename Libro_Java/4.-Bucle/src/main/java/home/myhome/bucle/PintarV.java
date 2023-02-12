package home.myhome.bucle;

import java.util.Scanner;

public class PintarV {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduzca la altura de V (un numero mayor o igual qa 3): ");
        int alturaIntroducida = s.nextInt();

        int altura = 0;
        int i = 0;
        int espaciosInternos = alturaIntroducida * 2 - 1;
        int espaciosPorDelante = 0;

        if (alturaIntroducida < 3) {
            System.out.println("La altura debe ser mayor o igual a 3.");
        } else {
            while (altura < alturaIntroducida) {
                // inserta espacios delante
                for (i = 1; i <= espaciosPorDelante; i++) {
                    System.out.print(" ");
                }

                // pinta la línea
                System.out.print("***");
                for (i = 1; i < espaciosInternos; i++) {
                    System.out.print(" ");
                }
                System.out.println("***");

                altura++;
                espaciosPorDelante++;
                espaciosInternos -= 2;
            }
        }
    }
}
