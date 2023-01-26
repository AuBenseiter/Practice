package home.myhome.bucle;

import java.util.Scanner;

public class DigitoporTeclado {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca un numero entero y le dire cuantos digitos tiene");
        long numeroIntroducido = s.nextLong();
        long n = numeroIntroducido;
        int numeroDeDigito = 1;

        while (n > 10) {
            numeroDeDigito++;
            n /= 10;
        }
        System.out.println(numeroIntroducido + " tiene " + numeroDeDigito + " digito/s");
    }
}
