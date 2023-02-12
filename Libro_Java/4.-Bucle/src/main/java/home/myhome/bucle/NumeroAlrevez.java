package home.myhome.bucle;

import java.util.Scanner;

public class NumeroAlrevez {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca un numero entero: ");
        int numeroIntroducido = s.nextInt();
        
        int numero = numeroIntroducido;
        int volteado = 0;
        
        while(numero > 0){
            volteado = (volteado*10) + (numero % 10);
            numero /= 10;
        }
        System.out.println("Si le damos al avuelta al numeri " + numeroIntroducido);
        System.out.println("Tenemos el " + volteado);
    }
}
