package home.myhome.bucle;

import java.util.Scanner;

public class TablasMultiplicar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca un numero y sabra las tabals demultiplicar");
        int numeroIntroducido = s.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d x %2d = %3d\n", numeroIntroducido, i, numeroIntroducido * i);
        }
    }
}
