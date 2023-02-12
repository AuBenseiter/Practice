package home.myhome.bucle;

import java.util.Scanner;

public class DesplazamiendoDerechaAIzquierda {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduzca un numero: ");
        long numeroIntroducido = s.nextLong();
        
        long copia = numeroIntroducido;
        int longitud = 0;
        
        while(copia > 0){
            copia /= 10;
            longitud++;
        }
        
        int primero = (int)(numeroIntroducido / Math.pow(10, longitud -1));
        long aux = (long)(primero * Math.pow(10, longitud - 1));
        long resultado = (numeroIntroducido - aux) * 10 + primero;
        System.out.println("El numero resultado es " + resultado);
    }
}
