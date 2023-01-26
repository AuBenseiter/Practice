package home.myhome.lecturaentrada;

import java.util.Scanner;

public class KbaMb {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Algoritmo que transforma de Kb a Mb");
        double x1 = s.nextDouble();
        
        System.out.println("Los: " + x1 + " Kb" + " Son: " + x1/1000 + " Mb");
        
    }
}
