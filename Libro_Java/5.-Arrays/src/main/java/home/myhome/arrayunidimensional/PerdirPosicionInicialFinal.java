package home.myhome.arrayunidimensional;

import java.util.Scanner;

public class PerdirPosicionInicialFinal {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] n = new int[10];
        int[] resultado = new int[10];

        int nInicial;
        int nFinal;

        boolean valido;

        for (int i = 0; i < 10; i++) {
            n[i] = (int) (Math.random() * 10);
        }

        System.out.println("Array Original");
        System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
        System.out.print("| indice ");
        for (int i = 0; i < 10; i++) {
            System.out.printf("|%4d ", i);
        }
        System.out.println("|\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
        System.out.print("| valor ");
        for (int i = 0; i < 10; i++) {
            System.out.printf("|%4d ", n[i]);
        }
        System.out.println("|\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");

        //pide las posiciones inicial y final
        do {
            valido = true;
            System.out.println("Introduzca la posicion inicial (0 - 9");
            nInicial = s.nextInt();
            if (nInicial < 0 || nInicial > 9) {
                System.out.println("Valor incorrecto, debe ser un numero entre 0 y 9");
                valido = false;
            }
            System.out.println("Introduzca la posicion final (0-9)");
            nFinal = s.nextInt();
            if ((nFinal < 0) || nFinal > 9) {
                System.out.println("Valor incorrecto, debe ser un numero entre 0 y 9");
                valido = false;
            }
            if (nInicial >= nFinal) {
                System.out.println("Valor incorrecto, debe ser un numero entre 0 y 9");
                valido = false;
            }
        } while (!valido);

        System.out.println("\n\nArray original");
        System.out.println("\n\nArray original:");
        System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
        System.out.print("│ Índice ");
        for (int i = 0; i < 10; i++) {
            System.out.printf("|%4d ", n[i]);
        }
        System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
        System.out.print("│ Valor  ");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%4d", n[i]);
        }
        System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
        for (int i = 0; i < 10; i++) {
            resultado[i] = n[i];
        }
        resultado[nFinal] = n[nInicial];
        for (int i = nFinal + 1; i < 10; i++) {
            resultado[i] = n[i - 1];
        }
        resultado[0] = n[9];
        for (int i = 0; i < nInicial; i++) {
            resultado[i + 1] = n[i];
        }

        System.out.println("\nArray resultante");
        System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
        System.out.print("│ Índice ");
        for (int i = 0; i < 10; i++) {
            System.out.printf("|%4d ", i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.printf("|%4d ", i);
        }
        System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
        System.out.print("│ Valor  ");
        for (int i = 0; i < 10; i++) {
            System.out.printf("|%4d ", resultado[i]);
        }
        System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    }
}
