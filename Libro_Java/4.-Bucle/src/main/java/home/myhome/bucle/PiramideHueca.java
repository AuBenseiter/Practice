package home.myhome.bucle;

import java.util.Scanner;

public class PiramideHueca {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Introduzca la altura de la piramide: ");
        int alturaIntroducida = s.nextInt();

        System.out.print("Introduzca el caracter de relleno: ");
        String relleno = s.next();

        int altura = 1;
        int i = 0;
        int espaciosPorDelante = alturaIntroducida - 1;
        int espaciosInternos = 0;

        while (altura < alturaIntroducida) {

            // inserta espacios delante
            for (i = 1; i <= espaciosPorDelante; i++) {
                System.out.print(" ");
            }

            // pinta la línea
            System.out.print(relleno);
            for (i = 1; i < espaciosInternos; i++) {
                System.out.print(" ");
            }

            if (altura > 1) {
                System.out.print(relleno);
            }

            System.out.println();
            altura++;
            espaciosPorDelante--;
            espaciosInternos += 2;
        } // while ////////////////////////////
        for (int j = 0; j < altura * 2; j++) {
            System.out.print(relleno);
        }
    }
}
