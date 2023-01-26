package home.myhome.condicional;

import java.util.Scanner;

public class SaberUltimoNumero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca un numero entero");
        int n = s.nextInt();
        System.out.println("La ultima cifra del numero introducido es el " + (n % 10));
    }
}
