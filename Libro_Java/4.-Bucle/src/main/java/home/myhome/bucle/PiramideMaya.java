package home.myhome.bucle;

import java.util.Scanner;

public class PiramideMaya {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduzca la altura de la piramide maya: ");
        int alturaIntroducida = s.nextInt();
        
        int planta = 1;
        int longitudDeLinea = 1;
        int espacios = alturaIntroducida - 1;
        
        while(planta <= alturaIntroducida){
            //izquierda
            for (int i = 1; i <= espacios; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i <= longitudDeLinea / 2; i++) {
                System.out.print("*");
            }
            
            //centro
            System.out.print(planta % 2 == 1 ? "****" : "    ");
            
            //derecha
            for (int i = 0; i <= longitudDeLinea / 2; i++) {
                System.out.print("*");
            }
            System.out.println();
            
            planta++;
            espacios--;
            longitudDeLinea += 2;
            }
        }
    }

