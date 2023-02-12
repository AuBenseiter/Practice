package home.myhome.bucle;

import java.util.Scanner;

public class DigitosQueAparecenEnUnNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca un numero entero: ");
        long numero = s.nextLong();
        
        long aux;
        boolean encontrado;
        
        System.out.print("Digitos que aparecen en el numero: ");
        
        for (int i = 0; i < 10; i++) {
            //combruena si i esta en el numero
            encontrado = false;
            aux = numero;
            while(aux > 0){
                if (aux % 10 == i) {
                    encontrado = true;
                }
                aux/=10;
            }
            if (encontrado) {
                System.out.print(i + " ");
            }
        }
        System.out.print("\nDigito que no aparecen: ");
        
        for (int i = 0; i < 10; i++) {
            //comprueba si i esta en el numero
            encontrado = false;
            aux = numero;
            while(aux > 0){
                if (aux % 10 == i) {
                    encontrado = true;
                }
                aux /= 10;
            }
            if (!encontrado) {
                System.out.print(i + " ");
            }
        }
    }
}
