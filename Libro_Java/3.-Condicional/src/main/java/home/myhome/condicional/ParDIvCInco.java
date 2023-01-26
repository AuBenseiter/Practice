package home.myhome.condicional;

import java.util.Scanner;

public class ParDIvCInco {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Este Algoritmo muestra si un numero es par o divisible en 5");
        int a = s.nextInt();
        if ( a % 2 == 0) {
            System.out.println("Es par");
        }else{
            System.out.println("El numero es impar");
        }
        if ( a / 5 == 0) {
            System.out.println("Es divisible por 5");
        }else{
            System.out.println(" y no es divisible en 5");
        }
        
    }
}
