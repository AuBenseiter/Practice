package home.myhome.bucle;

import java.util.Scanner;

public class EsPrimo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduzca un numero entreto y sabremos si es primo o no: ");
        int numeroIntroducido = s.nextInt();
        
        boolean esPrimo = true;
        
        for (int i = 2; i < numeroIntroducido; i++) {
            if ((numeroIntroducido % i == 0)) {
                esPrimo = false;
            }
        }
        
        if (esPrimo) {
            System.out.println("El numero introducido es primo");
        }else{
            System.out.println("El numero introducido no es primo");
        }
    }
}
