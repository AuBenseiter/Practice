package home.myhome.mavenproject3;

import java.util.Scanner;

public class algoritmoAdivinaNumeroPensado {
    public static void main(String[] args) {
        int oportunidades = 5;
        int numeroPensado;
        int minimo = 0;
        int maximo = 100;
        boolean acertado = false;
        int mayorMenorOIgual;
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Piensa en un numero del 1 al 100. Intentare adivina el 5 intentos: ");
        
        do {
            numeroPensado = (int)(Math.random() * (maximo - minimo) + minimo);
            System.out.println("Es el " + numeroPensado + "?");
            System.out.println("El número que estás pensando es 1) mayor 2) menor 3) el mismo:");
            mayorMenorOIgual = s.nextInt();
            oportunidades--;
            
            if ((mayorMenorOIgual == 1) && (oportunidades > 0)) {
                minimo = numeroPensado + 1;
            }
            if ((mayorMenorOIgual == 2) && (oportunidades > 0)) {
                maximo = numeroPensado - 1;
            }
            if ((mayorMenorOIgual == 3)) {
                acertado = true;
                System.out.println("Acertaste!");
            }
            
        } while (!acertado && (oportunidades > 0));
        
        if (!acertado) {
            System.out.println("Vaya, no he conseguido acertar el numero");
        }
    }
}
