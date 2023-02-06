package home.myhome.bucle;

import java.util.Scanner;

public class MediaImparesMayorPares {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("iNTRODUZCA NUMEROS ENTEROS. ");
        System.out.println("Puede terminar mediante la introduccion de un numero negativo");

        int numeroIntroducido;
        int numeroDeElementos = 0;
        int sumaImpares = 0;
        int numeroDeElementosImpares = 0;
        int maximoPar = 0;

        do {
            numeroIntroducido = s.nextInt();
            if (numeroIntroducido >= 0) {
                numeroDeElementos++;
                if ((numeroIntroducido % 2) == 1) { //numero impar
                    sumaImpares += numeroIntroducido;
                    numeroDeElementosImpares++;
                } else {//numero par
                    if (numeroIntroducido > maximoPar) {
                        maximoPar = numeroIntroducido;
                    }
                }
            }
        } while (numeroIntroducido >= 0);
        System.out.println("Ha introducido " + numeroDeElementos + " números positivos.");
        System.out.print("La media de los impares es ");
        System.out.println(sumaImpares / numeroDeElementosImpares + ".");
        System.out.println("El máximo de los pares es " + maximoPar + ".");
    }
}
