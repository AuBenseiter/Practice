package home.myhome.bucle;

import java.util.Scanner;

public class PiramideNumeros {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Este algoritmo muestra una piramide a base de numeros.");
        System.out.println("Por favor, introduzca la altura de la piramide: ");
        int alturaIntroducida = s.nextInt();
        
        int altura = 1;
        int i = 0;
        int espacios = alturaIntroducida -1;
        
        while(altura <= alturaIntroducida){
            //Inserta espacios
            for (int j = 1; j <= espacios; j++) {
                System.out.print(" ");
            }
            //pinta ka kinea de numeros
            for (int j = 1; j < altura; j++) {
                System.out.print( j);
            }
            
            for (int j = altura; j > 0; j--) {
                System.out.print( j);
            }
            
            System.out.println();
            
            altura++;
            espacios--;
            
        }
    }
}
