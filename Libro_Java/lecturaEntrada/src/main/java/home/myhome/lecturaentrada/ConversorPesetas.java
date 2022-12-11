package home.myhome.lecturaentrada;

import java.util.Scanner;

public class ConversorPesetas {
    public static void main(String[] args) {
        System.out.println("Conversor de Pesetas a Euros");
        System.out.println("Introduce las Pesetas a convertir: \n");
        Scanner s = new Scanner(System.in);
        double x1 = s.nextDouble();
        double resultado = x1*166.386;
        System.out.println("La convercion de " + x1+ " Pesetas " + "es:" + resultado +" Euros");
    }
}
