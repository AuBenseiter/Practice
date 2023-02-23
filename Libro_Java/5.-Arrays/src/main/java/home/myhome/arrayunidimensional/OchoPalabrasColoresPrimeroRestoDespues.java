package home.myhome.arrayunidimensional;

import java.util.Scanner;

public class OchoPalabrasColoresPrimeroRestoDespues {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] color = {
            "verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro ", "blanco", "morado"
        };

        String[] palabra = new String[8];
        String[] resultado = new String[8];

        System.out.println("Introduzca 8 palabras: ");

        int j = 0;

        for (int i = 0; i < 8; i++) {
            palabra[i] = s.next();

            //si la palabra introducida es un color
            for (String c : color) {
                if (palabra[i].equals(c)) {
                    resultado[j++] = c;
                }
            }
        }
        //Mete las palabra que no son colores al final del array
        for (int i = 0; i < 8; i++) {
            boolean esColor = false;
            for (String c : color) {
                if (palabra[i].equals(c)) {
                    esColor = true;
                }
            }
            if (!esColor) {
                resultado[j++] = palabra[i];
            }
        }
        System.out.println("Array Original");
        System.out.println("\n\nArray original:");
        System.out.println("\n┌────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐");
        for (int i = 0; i < 9; i++) {
            System.out.printf("│   %d    ", i);
        }
        System.out.println("│\n├────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┤");

        for (String p : palabra) {
            System.out.printf("│%-8s", p);
        }
        System.out.println("│\n└────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┘");

        //Muestra el resultado del Array
        System.out.println("\n\nArray resultado:");
        System.out.println("\n┌────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐");
        for (int i = 0; i < 8; i++) {
            System.out.printf("│   %d    ", i);
        }
        System.out.println("│\n├────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┤");
        
        for(String r : resultado){
            System.out.printf("│%-8s", r);
        }
        System.out.println("│\n└────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┘");
    }
}
