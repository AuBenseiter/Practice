package home.myhome.condicional;

import java.util.Scanner;

public class Capicua {

    public static void main(String[] args) {
        int n;
        boolean capicua = false;

        System.out.println("Por favor, introduzca un numero entero, de 5 cifras como maximo: ");
        Scanner s = new Scanner(System.in);
        n = Math.abs(s.nextInt());
        //Una cifra
        if (n < 10) {
            capicua = true;
        }
        //Dos crifras
        if ((n >= 10) && (n < 100)) {
            if ((n / 100) == (n % 10)) {
                capicua = true;
            }
        }
        //Tres cifras
        if ((n >= 100) && (n < 1000)) {
            if ((n / 100) == (n % 10)) {
                capicua = true;
            }
        }
        //Cuatro cifras
        if (n >= 1000 && n < 10000) {
            if (((n / 1000) == (n % 10)) && (((n / 100) % 10) == ((n / 10) % 10))) {
                capicua = true;
            }
        }
        //Cinco cifras
        if (n >= 10000) {
            if (((n / 10000) == (n % 10)) && ((((n / 1000) % 10)) == ((n / 10) % 10))) {
                capicua = true;
            }
        }
        if (capicua) {
            System.out.println("El numero introducido es capicua");
        }else{
            System.out.println("El numero no es capicua");
        }

    }
}
