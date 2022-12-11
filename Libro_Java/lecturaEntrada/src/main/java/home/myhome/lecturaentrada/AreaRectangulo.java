package home.myhome.lecturaentrada;

import java.util.Scanner;

public class AreaRectangulo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Calculador de Area de rectangulo y tringulo");
        System.out.println("introduce los lados del rectangulo: \n");
        double x1 = s.nextDouble();
        double x2 = s.nextDouble();
        System.out.println("Introduce la base y la altura del triangulo");
        double x3 = s.nextDouble();
        double x4 = s.nextDouble();
        double resultado1 = x1 * x2;
        double resultado2 = (x3 * x4) / 2;
        System.out.println("El area del rectangulo es: " + resultado1 + "\nEl area del Triangulo es: " + resultado2);

    }

}
