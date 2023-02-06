package home.myhome.bucle; 

import java.util.Scanner;

public class Exponente {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca la base: ");
        int base = s.nextInt();
        
        System.out.println("Introduzca el exponente maximo: ");
        int exponenteFinal = s.nextInt();
        
        int potencia;
        int exponente;
        
        for (int i = 0; i < exponenteFinal; i++) {
            potencia = 1;
            exponente = i;
            for (int j = 0; j < exponente; j++) {
                potencia *= base;
            }
            System.out.println(base + "^" + i + " = " + potencia);
        }
    }
}
