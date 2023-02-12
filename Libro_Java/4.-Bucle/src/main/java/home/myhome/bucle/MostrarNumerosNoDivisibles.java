package home.myhome.bucle;

import java.util.Scanner;

public class MostrarNumerosNoDivisibles {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca un numero enteto positivo (relativamente grande)");
        int numeroGrande = s.nextInt();
        
        System.out.println("Introduzca otro numero (relativamente pequenho)");
        int numeroPequenho = s.nextInt();
        
        System.out.print("Los numero enteros positivos menores que " + numeroGrande);
        System.out.println(" que no son divisibles entre " + numeroPequenho + " son los siguientes: ");
        
        int cuenta = 0;
        int suma = 0;
        
        for (int i = 1; i < numeroGrande; i++) {
            if ((i % numeroPequenho) != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
