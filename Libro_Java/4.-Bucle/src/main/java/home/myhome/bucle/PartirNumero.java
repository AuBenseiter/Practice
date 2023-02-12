package home.myhome.bucle; 

import java.util.Scanner;

public class PartirNumero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduzca un numero entero positivo: ");
        long numeroIntroducido = s.nextLong();
        
        System.out.println("Introduzca la posicion a partir de la cual quiere partir el numero: ");
        long posicion = s.nextLong();
        
        long numero = numeroIntroducido;
        
        //calcula la longitud del numero//////////////////////////////////////////////////////////////
        int longitud = 0;
        
        do {
            numero /= 10;
            longitud++;
        } while (numero > 0);
        //parte izquierda///////////////
        long parteIzquierda = numeroIntroducido / (long)(Math.pow(10, longitud - posicion + 1));
        
        //parte derecha///////////////////
        long parteDerecha = numeroIntroducido % (long)(Math.pow(10, longitud - posicion +1));
        
        System.out.println("Los numeros partidos son el " + parteIzquierda + " y el " + parteDerecha );
    }
}
