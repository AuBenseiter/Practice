package home.myhome.mavenproject3;

import java.util.Scanner;

public class ElegirAlAzarDigitoDeNumIntroducido {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduzca un numero entero positivo: ");
        long numeroIntroducido = s.nextLong();
        
        long numero = numeroIntroducido;
        //calcula la longitud del numero
        int longitud = 0;
        
        do {
            numero /= 10;
            longitud++;
        } while (numero>0);
        
        //elige una posicion al azar deltro del numero
        int posicion = (int)(Math.random()*longitud +1);
        
        //extrael el digito de esa posicion
        System.out.println((numeroIntroducido / (long)(Math.pow(10, longitud - posicion))) % 10);
    }
}
