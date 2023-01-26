package home.myhome.condicional;

import java.util.Scanner;

public class OrdenNumeros {

    public static void main(String[] args) {
        int aux;
        Scanner s = new Scanner(System.in);
        System.out.println("Este Algoritmo Ordena 3 numeros");
        System.out.println("Introduzca los numeros");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        
        //ordenacion de los dos primeros numero
        if (a>b) {
            aux = a;
            a = b;
            b = aux;
        }
        
        //ordenacion de los dos ultimos numeros
        if (b > c) {
            aux = c;
            b = c;
            c = aux;
        }
        
        //se vuelven a ordenar los dos primeros
        if (a > b) {
            aux = a;
            a = b;
            b = aux;
        }
        
        System.out.println("Los numeros introducidos ordenados de menos a mayor son : "
                + " " + a + ", " + b + ", " + c);
    }
}
