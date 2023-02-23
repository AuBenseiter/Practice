package home.myhome.mavenproject3;

import java.util.Scanner;

public class PintarSerpienteConSerpenteo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca la longitud de la serpiente");

        int longitud = s.nextInt();

        //cabeza
        System.out.println("\\n            @\"");

        //pinta cuerpo
        int i;
        int x = 13;
        while (longitud > 1) {
            // suma -1, 0 o 1 a la variable x
            x += (int) (Math.random() * 3) - 1;

            // pinta x - 1 espacios
            for (i = 1; i < x; i++) {
                System.out.print(" ");
            }

            // pinta el cuerpo
            System.out.println("#");

            longitud--;
        }
    }
}
