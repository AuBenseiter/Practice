package home.myhome.mavenproject3;

import java.util.Scanner;

public class AdivinaCeroCien {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int oportunidades = 5;
        int numeroIntroducido;
        boolean acertado = false;
        int numeroMisterioso = (int)(Math.random() * 101);
        
        System.out.println("Estoy pensando en un numero del 0 al 100, intenta adivinarlo. Tienes 5 oportunidades");
        
        do {
            System.out.println("Introduce un numero : ");
            numeroIntroducido = s.nextInt();
            oportunidades--;
            if ((numeroIntroducido > numeroMisterioso) && (oportunidades > 0)) {
                System.out.println("El numero que estoyy pensando es menor que " + numeroIntroducido);
                System.out.println("Te quedan: " + oportunidades + " oportunidades");
            }
            if ((numeroIntroducido < numeroMisterioso) && (oportunidades>0)) {
                System.out.println("El numero que estoy pensando es mayor que " + numeroIntroducido);
                System.out.println("Te quedan: " + oportunidades + " oportunidades");
            }
            if (numeroIntroducido == numeroMisterioso) {
                acertado = true;
                System.out.println("Has acertado");
            }
        } while (!acertado && (oportunidades >0));
        
        if (!acertado) {
            System.out.println("Lo siento, no has acertado, el numero que estaba pensando era el: " + numeroMisterioso);
        }
    }
}
