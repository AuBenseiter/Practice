package home.myhome.lecturaentrada;

import java.util.Scanner;

public class SumaScanner {

    public static void main(String[] args) {
        System.out.println("Introduce dos numeros a sumar: \n");
        Scanner s = new Scanner(System.in);
        double x1 = s.nextDouble();
        double x2 = s.nextDouble();
        double resultado = x1+x2;
        System.out.println("La suma de " + x1+ " y " + x2+ " es:" + resultado);
        
    }
}
