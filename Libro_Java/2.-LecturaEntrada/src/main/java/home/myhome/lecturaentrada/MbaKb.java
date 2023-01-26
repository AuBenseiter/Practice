package home.myhome.lecturaentrada;

import java.util.Scanner;

public class MbaKb {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Algoritmo que transforma de Mb a Kb");
        System.out.println("Ingrese los Mb a transformar");
        double x1 = s.nextDouble();
        System.out.println("Los: " + x1 +" Mb"+ " son: " + x1*1000 + " Kb");
        
        
    }
}
