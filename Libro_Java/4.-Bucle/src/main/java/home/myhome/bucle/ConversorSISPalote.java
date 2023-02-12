package home.myhome.bucle;

import java.util.Scanner;

public class ConversorSISPalote {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int num;
        do {
            System.out.println("Introduce un numero entero positivo");
            num = s.nextInt();
        } while (num < 1);
        System.out.print(num + " = ");
        
        //cuenta los numero y calcula el reves
        
        int aux = num;
        int numDig= 0;
        int numReves = 0;
        
        while(aux > 0){
            numReves = ((numReves*10) + (aux % 10));
            aux/=10;
            numDig++;
        }
        int cifra = 0;
        
        for (int i = 0; i < numDig; i++) {
            cifra = numReves % 10;
            numReves /= 10;
            for (int j = 0; j < cifra; j++) {
                System.out.print("|");
            }
            if (i < numDig-1) {
                System.out.print("-");
            }
        }
    }
}
