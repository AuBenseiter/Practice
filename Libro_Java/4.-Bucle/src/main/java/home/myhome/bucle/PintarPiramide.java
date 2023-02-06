package home.myhome.bucle;

import java.util.Scanner;

public class PintarPiramide {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Introduzca la altura de la piramide: ");
        int alturaIntroducida = s.nextInt();
        
        System.out.print("\nIntroduzca el caracter de rellenos: ");
        String relleno = s.next();
        
        int planta = 1;
        int longitudDeLinea =1;
        int espacios = alturaIntroducida-1;
        
        while(planta <= alturaIntroducida){
            //insertar espacios
            for (int i = 1; i <= espacios; i++) {
                System.out.print(" ");
            }
            //pinta la linea
            for (int i = 1; i < longitudDeLinea; i++) {
                System.out.print(relleno);
            }
            
            System.out.println();
            
            planta++;
            espacios--;
            longitudDeLinea += 2;
        }
    }
}
