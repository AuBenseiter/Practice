package home.myhome.lecturaentrada;

import java.util.Scanner;

public class BaseImponible {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca la base imponible (precio del articulo sin iva)");
        double x1 = s.nextDouble();
        System.out.printf("Base imponible %8.2f CLP\n", x1);
        System.out.printf("IVA(19%%)          %8.2f CLP\n", x1 * 0.19);
        System.out.println("--------------------------------------------");
        System.out.printf("Total                    %8.2f CLP", x1 * 1.19);
    }
}
