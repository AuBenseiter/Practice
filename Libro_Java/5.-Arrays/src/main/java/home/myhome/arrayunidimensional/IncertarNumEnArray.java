package home.myhome.arrayunidimensional;

import java.util.Scanner;

public class IncertarNumEnArray {

    public static void main(String[] args) {
        int[] n = new int[12];

        for (int i = 0; i < 12; i++) {
            n[i] = (int) (Math.random() * 201);
        }

        System.out.println("Array Original");

        System.out.print("\nÍndice ");

        for (int i = 0; i < 12; i++) {
            System.out.printf("%4d ", i);
        }
        System.out.print("\nValor  ");

        for (int i = 0; i < 12; i++) {
            System.out.printf("%4d ", n[i]);
        }
        // Pide el número y la posición donde colocarlo
        Scanner s = new Scanner(System.in);
        System.out.print("\n\nIntroduzca el número que quiere insertar: ");
        int numero = s.nextInt();

        System.out.print("Introduzca la posición donde lo quiere insertar (0 – 11): ");
        int posicion = s.nextInt();

        // Inserta el número y desplaza el resto hacia la derecha
        for (int i = 11; i > posicion; i--) {
            n[i] = n[i - 1];
        }

        n[posicion] = numero;

        // Muestra el resultado
        System.out.println("\nArray resultado:");

        System.out.print("\nÍndice ");
        for (int i = 0; i < 12; i++) {
            System.out.printf("%4d ", i);
        }
        System.out.print("\nValor  ");
        for (int i = 0; i < 12; i++) {
            System.out.printf("%4d ", n[i]);
        }
    }
}
