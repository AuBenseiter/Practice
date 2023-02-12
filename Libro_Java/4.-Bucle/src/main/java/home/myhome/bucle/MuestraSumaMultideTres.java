package home.myhome.bucle;

import java.util.Scanner;

public class MuestraSumaMultideTres {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca un numero entero mayor que 1: ");
        int numeroIntroducido = s.nextInt();
        
        int cuenta = 0;
        int suma = 0;
        
        for (int i = 0; i < numeroIntroducido; i++) {
            if (i%3 == 0) {
                System.out.print(i + " ");
                cuenta++;
                suma += i;
            }
        }
        System.out.print("\n desde 1 hata " + numeroIntroducido + " hay " + cuenta);
        System.out.println(" multiplos de 3 y suman " + suma);
    }
}
