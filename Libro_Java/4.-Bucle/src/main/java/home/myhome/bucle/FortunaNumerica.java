package home.myhome.bucle;

import java.util.Scanner;

public class FortunaNumerica {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduzca un numero: ");
        long numeroIntroducido = s.nextLong();
        long copia = numeroIntroducido;
        
        int afortunados = 0;
        int noAfortunados = 0;
        
        while(numeroIntroducido > 0){
            int digito = (int)(numeroIntroducido %10);
            if ((digito == 3) || (digito ==7) || (digito ==8) || (digito == 9)) {
                afortunados++;
            }else{
                noAfortunados++;
            }
            numeroIntroducido /= 10;
        }
        if (afortunados > noAfortunados) {
            System.out.println("El " + copia + " es un numero afortunado");
        }else{
            System.out.println("El " + copia + " no es un numero afortunado");
        }
    }
}
