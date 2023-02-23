package home.myhome.arrayunidimensional;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] mes = {
            "enero", "febrero", "marzo", "abril", "mayo", "junio", 
            "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre", 
        };
        
        int[] temperatura = new int[12];
        
        String verde = "\033[32m";
        String naranja = "\033[33m";
        String azul = "\033[34m";
        String morado = "\033[35m";
        String blanco = "\033[37m";
        
        for (int i = 0; i < 12; i++) {
            System.out.println("Introduzca la temperatura media de " + mes[i] + ": ");
            temperatura[i] = s.nextInt();
        }
        System.out.println();
        
        for (int i = 0; i < 12; i++) {
            System.out.printf(azul + "%12s " + verde + "│", mes[i]);
            for (int j = 0; j < temperatura[i]; j++) {
                System.out.print(morado + "▄");
            }
            System.out.println(naranja + " " + temperatura[i] + "ºC" + blanco);
        }
    }
}
