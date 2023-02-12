package home.myhome.bucle;

import java.util.Scanner;

public class ContadorParesImpares {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Introduzca un numero entero positivo: ");
        long numeroIntroducido = s.nextLong();
        
        long n = numeroIntroducido;
        int cuentaPares = 0;
        int cuentaImpares = 0;
        
        while(n > 0){
            if ((n%10) % 2 ==0) {
                cuentaPares++;
            }else{
                cuentaImpares++;
            }
            n /= 10;
        }
        System.out.println("El " + numeroIntroducido + " contiene " + cuentaPares + " digitos pares"
                + " y " + cuentaImpares + " digitos impares");
    }
}
