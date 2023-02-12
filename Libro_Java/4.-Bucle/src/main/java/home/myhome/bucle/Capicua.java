package home.myhome.bucle;

import java.util.Scanner;

public class Capicua {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduzca un numero entero positivo: ");
        long numeroIntroducido = s.nextLong();
        
        //voltear numero introducido
        
        long numero = numeroIntroducido;
        long volteado = 0;
        
        while(numero > 0){
            volteado = (volteado * 10) + (numero % 10);
            numero /= 10;
        }
        
        if (volteado == numeroIntroducido) {
            System.out.println("El " + numeroIntroducido + " es capicua");
        }else{
            System.out.println("El " + numeroIntroducido + " no es capicua");
        }
    }
}
