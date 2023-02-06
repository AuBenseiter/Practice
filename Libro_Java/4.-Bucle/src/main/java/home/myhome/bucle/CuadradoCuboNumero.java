package home.myhome.bucle;

import java.util.Scanner;

public class CuadradoCuboNumero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduzca un numero: ");
        int numeroIntroducido = s.nextInt();
        System.out.println("   n  |    n²   |    n³");
        System.out.println("----------------------------");
    for (int i = numeroIntroducido; i < numeroIntroducido + 5; i++) {
            System.out.printf("%5d  |%8d  |%9d\n", i, i*i, i*i*i);
        }
    }
}
