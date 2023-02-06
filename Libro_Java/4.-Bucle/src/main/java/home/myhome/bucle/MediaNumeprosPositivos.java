package home.myhome.bucle;

import java.util.Scanner;

public class MediaNumeprosPositivos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double numeros = 0;
        double numeroIntroducido = 0;
        double suma =0;
        
        System.out.println("Calculo de media de numeros positivos");
        System.out.println("Para detenerse introduzca un numero negativo");
        System.out.println("Introduzca los numeros");
        
        while(numeroIntroducido >= 0){
            numeroIntroducido = s.nextDouble();
            numeros++;
            suma += numeroIntroducido;
        }
        System.out.println("La media es : ");
        System.out.println((suma - numeroIntroducido) / (numeros - 1));
    }
}
