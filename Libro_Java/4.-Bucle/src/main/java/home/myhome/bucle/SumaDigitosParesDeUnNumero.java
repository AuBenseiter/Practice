package home.myhome.bucle;

import java.util.Scanner;

public class SumaDigitosParesDeUnNumero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca un numero entero positivo: ");
        long numeroIntroducido = s.nextLong();
        
        // vuelta al numero y calculo de longitud
        
        long numero = numeroIntroducido;
        long volteado = 0;
        int longitud = 0;
        
        if (numero == 0) {
            longitud = 1;
            
        }
        while(numero > 0){
            volteado = (volteado * 10 ) + (numero % 10);
            numero /= 10;
            longitud++;
        }
        //Muestra los digitos pares
        System.out.print("Digitos pares: ");
        
        int digito;
        int sumaPares = 0;
        
        for (int i = 0; i < longitud; i++) {
            digito = (int)(volteado % 10);
            if ((digito % 2 ) == 0) {
                System.out.print(digito +" ");
                sumaPares += digito;
            }
            volteado /= 10;
        }
        //Muestra la suma de los digitos pares
        System.out.println("\nSuma de los digitos pares: " + sumaPares);
    }
}
