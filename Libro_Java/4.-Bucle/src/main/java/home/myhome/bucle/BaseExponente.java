package home.myhome.bucle;

import java.util.Scanner;

public class BaseExponente {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Este algoritmo calcula la potencia");
        System.out.println("Introduzca la base");
        int base = s.nextInt();
        
        System.out.println("Introduzca el exponente");
        int exponente = s.nextInt();
        
        int potencia = 1;
        
        if (exponente == 0) {
            potencia = 1;
        }
        
        if (exponente > 0) {
            for (int i = 0; i < exponente; i++) {
                potencia *= base;
            }
        }
        if (exponente < 0) {
            for (int i = 0; i < -exponente; i++) {
                potencia *= base;
            }
            potencia = 1/potencia;
        }
        System.out.println(base + "^" + exponente + " = " + potencia);
    }
}
