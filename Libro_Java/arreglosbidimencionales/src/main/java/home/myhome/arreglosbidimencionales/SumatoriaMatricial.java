package home.myhome.arreglosbidimencionales;

import java.util.Scanner;

public class SumatoriaMatricial {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] num = new int[4][5];
        
        int fila;
        int columna;
        
        System.out.println("Por favos introduzca los numero en el array");
        for (fila = 0; fila < 4; fila++) {
            for (columna = 0; columna < 5; columna++) {
                System.out.println("fila " + fila+ ", columna" + columna + ": ");
                num[fila][columna] = s.nextInt();
            }
        }
        
        System.out.println();
        
        int sumaFilas;
        for (fila = 0; fila < 4; fila++) {
            sumaFilas = 0;
            for (columna = 0; columna < 5; columna++) {
                System.out.printf("%7d", num[fila][columna]);
                sumaFilas += num[fila][columna];
            }
            System.out.printf("|%7d\n", sumaFilas);
        }
        
        for ( columna = 0; columna < 5; columna++) {
            System.out.print("----------");
        }
        System.out.println("----------");
        
        int sumaColumnas;
        int sumaTotal = 0;
        for ( columna = 0; columna < 5; columna++) {
            sumaColumnas = 0;
            for (fila = 0; fila < 4; fila++) {
                sumaColumnas += num[fila][columna];
            }
            sumaTotal += sumaColumnas;
            System.out.printf("%7d ", sumaColumnas);
            
        }
        System.out.printf("|%7d ", sumaTotal);
    }
}
