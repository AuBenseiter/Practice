package home.myhome.arreglos;

import java.util.Scanner;

public class MaximoMinimo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numero = new int[10];
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;

        System.out.println("Introdusca numeros y aprete enter");

        for (int i = 0; i < 10; i++) {
            numero[i] = s.nextInt();
            if (numero[i] < minimo) {
                minimo = numero[i];
            }
            if (numero[i] > maximo) {
                maximo = numero[i];
            }
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.println(numero[i]);
            if (numero[i] == maximo) {
                System.out.println("Maximo");
            }
            if (numero[i] == minimo) {
                System.out.println("Minimo");
            }
            System.out.println();
        }
    }
}
