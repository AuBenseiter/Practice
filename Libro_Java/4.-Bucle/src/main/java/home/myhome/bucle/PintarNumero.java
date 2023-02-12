package home.myhome.bucle;

import java.util.Scanner;

public class PintarNumero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca la altura (como minimo 5): ");
        int altura = s.nextInt();
        System.out.println("Introduzca el numero de espacio entre los numeros (minimo 1): ");
        int espacios = s.nextInt();
        
        //parte superios del 5/////////////////////////////////////
        System.out.print("*");
        for (int i = 0; i < espacios; i++) {
            System.out.print(" ");
        }
        System.out.print("****");
        for (int i = 0; i < espacios; i++) {
            System.out.print(" ");
        }
        System.out.println("****");
        
        //fila 2/////////////////////////////////////////////////////////////////
        System.out.print("*");
        for (int i = 0; i < espacios; i++) {
            System.out.print(" ");
        }
        System.out.println("*   ");
        for (int i = 0; i < espacios; i++) {
            System.out.print(" ");
        }
        System.out.println("*");
        
        //Fila 3 (igual que la fila 1)
        
        System.out.print("*");
        for (int i = 0; i < espacios; i++) {
            System.out.print(" ");
        }
        System.out.print("****");
        for (int i = 0; i < espacios; i++) {
            System.out.print(" ");
        }
        System.out.println("****");
        
        //parte inferior del 5////////////////////////////////////
        //filas variasble
        for (int fila = 0; fila < altura - 4; fila++) {
            System.out.print("*");
            for (int i = 0; i < espacios; i++) {
                System.out.print(" ");
            }
            System.out.print("   *");
            for (int i = 0; i < espacios; i++) {
                System.out.print(" ");
            }
            System.out.println("   *");
        }
        //ultima fila (igual que la primera)
        
        System.out.print("*");
        for (int i = 0; i < espacios; i++) {
            System.out.print(" ");
        }
        System.out.print("****");
        for (int i = 0; i < espacios; i++) {
            System.out.print(" ");
        }
        System.out.println("****");
    }
}
