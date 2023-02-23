package home.myhome.arrayunidimensional;

import java.util.Scanner;

public class ParOImpar {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numero = new int[8];

        System.out.println("Introduzca 8 numeros (intro para cada numero): ");

        for (int i = 0; i < 8; i++) {
            numero[i] = s.nextInt();
        }
        System.out.println();

        for (int i = 0; i < 8; i++) {
            if (numero[i] % 2 == 0) {
                System.out.println(numero[i] + " par");
            }else{
                System.out.println(numero[i] + " impar");
            }
        }
    }
}
