package home.myhome.bucle;

import java.util.Scanner;

public class Continuacio5NumPrimoONo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduzca un numero entero positivo: ");
        int numeroIntroducido = s.nextInt();
        
        boolean esPrimo;
        
        for (int n = numeroIntroducido;  n < numeroIntroducido + 5;  n++) {
            //Comprueba si n es primo/////////////////////////////////////////////
            esPrimo = true;
            for (int i = 2; i < n; i++) {
                if (n% i == 0) {
                    esPrimo = false;
                }
            }
            //muestra por pantalla si es primo o no//////////////////////////////////////
            if (esPrimo) {
                System.out.println(n + " es primo");
            }else{
                System.out.println(n+ " no es primo");
            }
        }
        System.out.println();
    }
}
