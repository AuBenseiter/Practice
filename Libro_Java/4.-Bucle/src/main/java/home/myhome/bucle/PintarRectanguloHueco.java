package home.myhome.bucle;

import java.util.Scanner;

public class PintarRectanguloHueco {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduzca la anchura del rectanglo (como minimo 3): ");
        int anchura = s.nextInt();
        
        System.out.println("Ahora introduzca la altura (como minimo 3): ");
        int altura = s.nextInt();
        
        if ((anchura < 2) || (altura < 2)) {
            System.out.println("Los datos introsucidos no son los correctos");
        }else{
            //linea superior////////////////////////
            for (int i = 1; i <= anchura; i++) {
                System.out.print("*");
            }
            
            //parte intermedia////////////////////
            for (int i = 2; i < altura; i++) {
                System.out.print("\n*");
                for (int espacios = 2; espacios < anchura; espacios++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
            
            //linea inferior///////////////////////////
            for (int i = 1; i <= anchura; i++) {
                System.out.print("*");
            }
        }
    }
}
