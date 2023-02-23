package home.myhome.mavenproject3;

import java.util.Scanner;

public class PintarCubaConAgua {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Indique la capacidad de la cuba en litros: ");
        int capacidad = s.nextInt();

        System.out.println();

        int litros = (int) (Math.random() * (capacidad + 1));

        for (int i = 0; i < capacidad; i++) {
            if (i < (capacidad - litros)) {
                System.out.println("#    #");
            } else {
                System.out.println("#====#");
            }
        }
        System.out.println("######"); // fondo de la cuba
        System.out.print("La cuba tiene una capacidad de " + capacidad);
        System.out.print(" litros y contiene " + litros + " litros de agua.");
    }
}
