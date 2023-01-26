package home.myhome.condicional;

import java.util.Scanner;

public class NumeroDigitos {

    public static void main(String[] args) {
        System.out.println("Introdusca un numero");
        Scanner s = new Scanner(System.in);
        int digitos = 0;
        int num = Math.abs(s.nextInt());
        
        if (num < 10) {
            digitos = 1;
        }
        if (num >= 10 && num < 100) {
            digitos = 2;
        }
        if (num >= 100 && num < 1000) {
            digitos = 3;
        }
        if (num >= 1000 && num < 10000) {
            digitos = 4;
        }
        if (num >= 10000) {
            digitos = 5;
        }
        if (num == 1) {
            System.out.println("El numero introducido tienen 1 digito");
        }else{
            System.out.println("El numero introducido tien " + digitos + " digitos");
        }
    }
}
