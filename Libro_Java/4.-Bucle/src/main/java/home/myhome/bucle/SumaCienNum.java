package home.myhome.bucle;

import java.util.Scanner;

public class SumaCienNum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int numeroIntroducido = 0;

        do {
            System.out.println("Introduzca un numero entero positivo");
            numeroIntroducido = s.nextInt();
            if (numeroIntroducido < 0) {
                System.out.println("El numero introducido no es correcto, introduzca un numero positivo");
            }
        } while (numeroIntroducido < 0);
        int suma = 0;
        
        for (int i = numeroIntroducido; i < numeroIntroducido + 100; i++) {
            suma += i;
        }
        System.out.print("La suma de los 100 numeros siguientes a ");
        System.out.println(numeroIntroducido + " es " + suma + ".");
    }
}
