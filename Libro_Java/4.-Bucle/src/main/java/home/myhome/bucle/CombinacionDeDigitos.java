package home.myhome.bucle;

import java.util.Scanner;

public class CombinacionDeDigitos {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Por favor, introduzca un numero: ");
        long numeroIntroducido1 = s.nextLong();

        System.out.println("Introduzca otro numero: ");
        long numeroIntroducido2 = s.nextLong();

        //Voltea el primer numero y calcula la longitud//
        //se da por echo qu elos dos numeros introducidos tiene la misma longitud//
        long numero = numeroIntroducido1;
        long volteado1 = 0;
        int longitud = 0;

        if (numero == 0) {
            longitud = 1;
        }
        while (numero > 0) {
            volteado1 = (volteado1 * 10) + (numero % 10);
            numero /= 10;
            longitud++;
        }

        //volteado el segundo numero//
        numero = numeroIntroducido2;
        long volteado2 = 0;

        while (numero > 0) {
            volteado2 = (volteado2 * 10) + (numero % 10);
            numero /= 10;
        }
        //recorre los dos numeros volteados para formar los dos resultados//
        long resultadoPares = 0;
        long resultadoImpares = 0;
        int digito;

        for (int i = 0; i < longitud; i++) {
            digito = (int) (volteado1 % 10);

            if ((digito % 2) == 0) {
                resultadoPares = resultadoPares * 10 + digito;
            } else {
                resultadoImpares = resultadoImpares * 10 + digito;
            }
            digito = (int)(volteado2 % 10);
            
            if ((digito % 2) == 0) {
                resultadoPares = resultadoPares * 10 + digito;
            }else{
                resultadoImpares = resultadoImpares * 10 + digito;
            }

            volteado1 /= 10;
            volteado2 /= 10;
        }
        System.out.println("El número formado por los dígitos pares es: " + resultadoPares);
        System.out.println("El número formado por los dígitos impares es: " + resultadoImpares);
    }
}
