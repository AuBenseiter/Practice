package home.myhome.bucle;

import java.util.Scanner;

public class OchoConM {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca la altura (numero impar mayor o igual a 5): ");
        int altura = s.nextInt();
        
        int alturaAux = (altura - 3) / 2;
        
        if ((altura % 2 != 0) && (altura >= 5)) {
            System.out.println("MMMMMM");
            
            for (int i = 0; i < alturaAux; i++) {
                System.out.println("M    M");
            }
            
            System.out.println("MMMMMM");
            
            for (int i = 0; i < alturaAux; i++) {
                System.out.println("M    M");
            }
            System.out.println("MMMMMM");
        }else{
            System.out.println("La altura introducida no es correcta");
        }
    }
}
