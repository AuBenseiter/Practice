package home.myhome.bucle;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Este algoritmo muestra los n primeros numeros de la serie Fibonacci");
        System.out.println("Por favor, introduzca n: ");
        int n = s.nextInt();

        switch (n) {
            case 1 -> {
                System.out.print("0");
            }
            case 2 -> {
                System.out.print("0 1");
            }
            default -> {
                System.out.print("0 1");
                int f1 = 0;
                int f2 =1;
                int aux;
                while (n > 2){
                    aux = f1;
                    f1 = f2;
                    f2 = aux + f2;
                    System.out.print(" " + f2);
                    n--;
                }
            }
            
        }
        System.out.println();
    }
}
