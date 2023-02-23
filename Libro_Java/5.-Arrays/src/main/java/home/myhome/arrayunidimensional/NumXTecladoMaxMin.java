package home.myhome.arrayunidimensional;

import java.util.Scanner;

public class NumXTecladoMaxMin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numero = new int[10];
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        
        System.out.println("Introduzca numeros y aprete enter: ");
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
            System.out.print(numero[i]);
            if (numero[i] == maximo) {
                System.out.print(" Maximo");
            }
            if (numero[i] == minimo) {
                System.out.print(" Minimo");
            }
            System.out.println();
        }
    }
}
