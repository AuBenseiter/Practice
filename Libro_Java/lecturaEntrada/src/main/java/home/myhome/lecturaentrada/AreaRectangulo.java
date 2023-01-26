package home.myhome.lecturaentrada;

import java.util.Scanner;

public class AreaRectangulo {

    public static void main(String[] args) {
        System.out.println("Algoritmo que Calcula Area de un Rectangulo");
        Scanner s = new Scanner(System.in);
        System.out.println("Primer Dato");
        double x1 = s.nextDouble();
        System.out.println("Segundo Dato");
        double x2 = s.nextDouble();

        System.out.println("El area del rectangulo de lados: " +x1+" y "+x2 + " es: "  + x1*x2);
    }
}
