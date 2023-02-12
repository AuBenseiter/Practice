package home.myhome.bucle;

import java.util.Scanner;

public class PintarCalsetinesNavidad {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduzca la altuira de los calcetines: ");
        int altura = s.nextInt();

        for (int i = 0; i < altura; i++) {
            System.out.println("***     ***");
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("******  ******");
        }
    }
}
