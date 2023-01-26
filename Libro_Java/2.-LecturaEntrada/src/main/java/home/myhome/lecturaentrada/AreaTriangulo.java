package home.myhome.lecturaentrada;

import java.util.Scanner;

public class AreaTriangulo {

    public static void main(String[] args) {
        System.out.println("Algoritmo que Calcula Area de un Triangulo");
        Scanner s = new Scanner(System.in);
        System.out.println("Base del Triangulo");
        double x1 = s.nextDouble();
        System.out.println("Altura del Triangulo");
        double x2 = s.nextDouble();

        System.out.println("El area del rectangulo de lados: " +x1+" y "+x2 + " es: "  + (x1*x2)/2);
    }
}
