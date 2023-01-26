package home.myhome.condicional;

import java.util.Scanner;

public class Caida {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Calculo de tiempo de caida de un objeto");
        System.out.println("Introduzca la altura en metro");
        Double h = s.nextDouble();

        final double g = 9.81; //las constantes se declaran con final
        double d = Math.sqrt(2 * h/ g);

        System.out.printf("El objeto tarda %.2f segundoes en caer . \n", d);
    }
}
