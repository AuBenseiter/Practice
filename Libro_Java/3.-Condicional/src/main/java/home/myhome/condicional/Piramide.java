package home.myhome.condicional;

import java.util.Scanner;

public class Piramide {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Este Algoritmo pinta una pirámide.");
        System.out.print("Introduzca un carácter de relleno: ");
        String r = s.nextLine();
        System.out.println("Elija un tipo de pirámide");
        System.out.println("1. Con el vértice hacia arriba");
        System.out.println("2. Con el vértice hacia abajo");
        System.out.println("3. Con el vértice hacia la izquierda");
        System.out.println("4. Con el vértice hacia la derecha");
        int opcion = s.nextInt();

        switch (opcion) {
            case 1 -> {
                System.out.println("  " + r);
                System.out.println(" " + r + r + r);
                System.out.println(r + r + r + r + r);
            }
            case 2 -> {
                System.out.println(r + r + r + r + r);
                System.out.println(" " + r + r + r);
                System.out.println("  " + r);
            }
            case 3 -> {
                System.out.println("    " + r);
                System.out.println("  " + r + " " + r);
                System.out.println(r + " " + r + " " + r);
                System.out.println("  " + r + " " + r);
                System.out.println("    " + r);
            }
            case 4 -> {
                System.out.println(r);
                System.out.println(r + " " + r);
                System.out.println(r + " " + r + " " + r);
                System.out.println(r + " " + r);
                System.out.println(r);
            }
            default -> {
            }
        }
    }
}
