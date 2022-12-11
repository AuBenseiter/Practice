package home.myhome.arreglos;

import java.util.Scanner;

public class AlmacenArray {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numero = new int[15];

        System.out.println("Introduce numeros enteros");

        for (int i = 0; i < 15; i++) {
            numero[i] = s.nextInt();
        }
        System.out.println();
        //Original
        System.out.println("Array original");
        for (int i = 0; i < 15; i++) {
            System.out.printf("|%3d", i);
        }
        System.out.println("|");
        for (int i = 0; i < 1; i++) {
            System.out.println("-");
        }
        System.out.println("-");
        for (int i = 0; i < 15; i++) {
            System.out.printf("|%3d", numero[i]);
        }
        System.out.println("|");
        
        //rotando
        int aux = numero[14];
        for (int i = 14; i > 0; i--) {
            numero[i] = numero[i - 1];
        }
        numero[0] = aux;
        //Rotado
        System.out.println("Array rotado a la derecha una posicion");
        for (int i = 0; i < 15; i++) {
            System.out.printf("|%3d ", i);
        }
        System.out.println("|");
        for (int i = 0; i < 1; i++) {
            System.out.println("-");
        }
        System.out.println("-");
        for (int i = 0; i < 15; i++) {
            System.out.printf("|%3d", numero[i]);
        }
        System.out.println("|");
    }
}
