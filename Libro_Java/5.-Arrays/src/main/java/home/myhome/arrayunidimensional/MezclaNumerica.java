package home.myhome.arrayunidimensional;

import java.util.Scanner;

public class MezclaNumerica {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numero = new int[100];
        String verde = "\033[32m";
        String blanco = "\033[37m";

        for (int i = 0; i < 100; i++) {
            numero[i] = (int) (Math.random() * 21);
            System.out.println(numero[i] + "  ");
        }
        System.out.print("\nIntroduzca un número de los que se han mostrado: ");
        int valor1 = s.nextInt();
        System.out.print("Introduzca el valor por el que quiere sustituirlo: ");
        int valor2 = s.nextInt();
        
        System.out.println();
        
        for (int i = 0; i < 100; i++) {
            if (numero[i] == valor1) {
                numero[i] = valor2;
                System.out.println(verde + "\"" + numero[i] + "\" ");
            }
        }
    }
}
