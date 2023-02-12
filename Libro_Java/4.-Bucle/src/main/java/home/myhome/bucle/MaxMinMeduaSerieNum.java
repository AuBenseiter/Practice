package home.myhome.bucle;

import java.util.Scanner;

public class MaxMinMeduaSerieNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Vaya introduciendo numeros enteros positivos");
        System.out.println("Oara termina, introduzca un numero primo: ");
        
        int numero;
        int suma = 0;
        int cuentaNumeros = 0;
        int maximo = Integer.MAX_VALUE;
        int minimo = Integer.MIN_VALUE;
        boolean esPrimo;
        
        do {
            numero = s.nextInt();
            //comprueba si el numero introducido es primo /////////////////
            esPrimo = true;
            for (int i = 2; i < numero; i++) {
                if ((numero% i) == 0) {
                    esPrimo = false;
                }
            }
            
            // si no es primo///////////////////////////////////////
            if (!esPrimo) {
                suma += numero;
                cuentaNumeros++;
                
                maximo = numero > maximo ? numero : maximo;
                minimo = numero < minimo ? numero : minimo;
            }
        } while (!esPrimo);
        
        System.out.println("Has introducido " + cuentaNumeros + " numeros no primos" );
        System.out.println("Maximo " + maximo);
        System.out.println("Minimo " + minimo);
        System.out.println("Media " + (double)suma / cuentaNumeros);
    }
}
