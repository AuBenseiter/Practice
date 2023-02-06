package home.myhome.condicional;

import java.util.Scanner;

public class PresupuestoTarta {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Elija un sabor (manzana, fresa o chocolate): ");
        String sabor = s.next().toLowerCase();

        //Declaracion de variables
        double precioSabor = 0;
        double precioNata = 0;
        double precioNombre = 0;
        String tipoChocolate = "";

        switch (sabor) {
            case "manzana" ->
                precioSabor = 18;
            case "fresa" ->
                precioSabor = 16;
            case "chocolate" -> {
                System.out.println("Que tipo de chocolate quiere? (negro o blanco)");
                tipoChocolate = s.next().toLowerCase();
                if (tipoChocolate.equals("negro")) {
                    precioSabor = 14;
                } else if (tipoChocolate.equals("blanco")) {
                    precioSabor = 15;
                }
            }
            default -> {
            }
        }
        System.out.println("Quiere nata? (si o no): ");
        boolean conNata = s.next().toLowerCase().equals("si");

        System.out.println("Quiere ponerle un nombre? (si o no): ");
        boolean conNombre = s.next().toLowerCase().equals("si");

        System.out.println("Tarta de " + sabor);

        if (sabor.equals("chocolate")) {
            System.out.print(" " + tipoChocolate);
        }

        System.out.printf(": %.2f CLP\n", precioSabor);

        if (conNata) {
            precioNata = 2.5;
            System.out.printf("Con nata: %.2f CLP\n", precioNata);
        }
        if (conNombre) {
            precioNombre = 2.75;
            System.out.printf("Con nombre: %.2f CLP\n", precioNombre);
        }
        System.out.printf("Total: %.2f\n", precioSabor + precioNata + precioNombre);
    }
}
