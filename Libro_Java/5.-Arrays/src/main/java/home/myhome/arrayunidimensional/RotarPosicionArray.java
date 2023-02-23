package home.myhome.arrayunidimensional;

import java.util.Scanner;

public class RotarPosicionArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numero = new int[15];
        System.out.println("Introduzca 15 numeros: ");
        
        for (int i = 0; i < 15; i++) {
            numero[i] = (int)(Math.random()*10);//s.nextInt();
        }
        System.out.println();
        
        System.out.println("Array original");
        for (int i = 0; i < 15; i++) {
            System.out.printf("|%3d ", i);
        }
        System.out.println("|");
        for (int i = 0; i < 75; i++) {
            System.out.print("-");
        }
        System.out.println("-");
        for (int i = 0; i < 15; i++) {
            System.out.printf("|%3d ", numero[i]);
        }
        System.out.println("|");
        //////////////////////////////////////////////////////////
        //Rota la posicion
        int aux = numero[14];
        for (int i = 14; i > 0; i--) {
            numero[i] = numero[i-1];
        }
        numero[0] = aux;
        /////////////////////////////////////////////////////////////////////
        
        System.out.println("Array rotado a la derecha de la posicion: ");
        for (int i = 0; i < 15; i++) {
            System.out.printf("|%3d ", i);
        }
        System.out.println("|");
        for (int i = 0; i < 75; i++) {
            System.out.print("-");
        }
        System.out.println("-");
        for (int i = 0; i < 15; i++) {
            System.out.printf("|%3d ", numero[i]);
        }
        System.out.println("|");
    }
}
