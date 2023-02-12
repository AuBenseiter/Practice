package home.myhome.bucle;

import java.util.Scanner;

public class CalculoFactorial {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numeroIntroducido;
        do {
            System.out.println("Introduca un numero enter: ");
            numeroIntroducido = s.nextInt();

            if (numeroIntroducido < 0) {
                System.out.println("El numero introducido no es correcto.");
            }

        } while (numeroIntroducido < 0);
        
        int factorial = numeroIntroducido;

        if (numeroIntroducido == 0) {
            System.out.println("0! = 1");
        } else {
            for (int i = 1; i < numeroIntroducido; i++) {
                factorial *= i;
            }
            System.out.println(numeroIntroducido + "! = " + factorial);
        }
    }
}
