package home.myhome.bucle;

import java.util.Scanner;

public class MediaDeLosDigitosDeUnNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        long numeroIntroducido = s.nextLong();
        
        int suma = 0;
        int longitud = 0;
        
        while(numeroIntroducido >0){
            suma += numeroIntroducido % 10;
            numeroIntroducido /= 10;
            longitud++;
        }
        System.out.println("La media de sus digitos es " + ((double)suma /longitud));
    }
}
