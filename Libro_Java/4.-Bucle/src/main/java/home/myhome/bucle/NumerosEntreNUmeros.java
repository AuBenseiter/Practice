package home.myhome.bucle;

import java.util.Scanner;

public class NumerosEntreNUmeros {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int primerNumero;
        int segundoNumero;
        
        do {
            System.out.print("Imtrpduzca un numero entero: ");
            primerNumero = s.nextInt();
            System.out.print("\nIntroduzca el segundo numero: ");
            segundoNumero = s.nextInt();
            
            if (primerNumero == segundoNumero) {
                System.out.println("Los numero introducidos no son validos deben ser distintos.");
            }
        } while (primerNumero == segundoNumero);
        //si el primer numero es mayor que el segundo, se intercambian los valores
        if (primerNumero > segundoNumero) {
            int aux = primerNumero;
            primerNumero = segundoNumero;
            segundoNumero = aux;
        }
        for (int i = primerNumero; i <= segundoNumero; i+=7) {
            System.out.println(i + " ");
        }
        System.out.println("");
    }
}
