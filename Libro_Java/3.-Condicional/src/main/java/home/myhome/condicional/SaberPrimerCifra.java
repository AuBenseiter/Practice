package home.myhome.condicional;

import java.util.Scanner;

public class SaberPrimerCifra {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Por favor, introduzca un numero entero positivo (5 cifras como  maximo)");
        int primera = 0;
        int n = s.nextInt();

        if (n < 10) {
            primera = n;
        }
        if ((n >= 10) && (n < 100)) {
            primera = n/10;
        }
        if ((n >= 100) && (n < 1000)) {
            primera = n /100;
        }
        if ((n >= 1000) && (n < 10000)) {
            primera = n /1000;
        }
        if (n  >= 10000) {
            primera = n / 10000;
        }
        System.out.println("La primera cifra del numero introducido es el " + primera);
    }
}
