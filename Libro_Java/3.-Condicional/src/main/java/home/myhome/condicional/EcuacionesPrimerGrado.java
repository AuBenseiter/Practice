package home.myhome.condicional;

import java.util.Scanner;

public class EcuacionesPrimerGrado {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Resolvedor de ecuaciones de primer grado (ax + b = 0)");
        System.out.println("Introduzca a: ");
        Double a = s.nextDouble();

        System.out.println("Introduzca b: ");
        Double b = s.nextDouble();

        if (a == 0) {
            System.out.println("Esa ecuacion no tiene solucion real");
        } else {
            System.out.println("x = " + (-b / a));
        }

    }
}
