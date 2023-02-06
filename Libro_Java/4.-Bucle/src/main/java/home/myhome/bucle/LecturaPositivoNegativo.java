package home.myhome.bucle;

import java.util.Scanner;

public class LecturaPositivoNegativo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduzca 10 numeros enteros: ");
        int negativos = 0;
        int positivos = 0;
        //int numero = s.nextInt();
        for (int i = 0; i < 10; i++) {
            if (s.nextInt() < 0) {
                negativos++;
            }else{
                positivos++;
            }
        }
        System.out.println("Has introducido " + positivos + " positivos y " + negativos + " negativos. ");
    }
}
