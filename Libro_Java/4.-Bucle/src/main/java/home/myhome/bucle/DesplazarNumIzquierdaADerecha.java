package home.myhome.bucle;

import java.util.Scanner;

public class DesplazarNumIzquierdaADerecha {
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
        
        int ultimo = (int)(numeroIntroducido %10);
        long aux = numeroIntroducido /10;
        long resultado = ultimo * (long) Math.pow(10, longitud - 1) + aux;
        System.out.println("El numero resultante es " + resultado);
    }
}
