package home.myhome.condicional;

import java.util.Scanner;

public class MediaTresNotas {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Este programa calcula la media de tres notas");
        System.out.println("Ingrese las tres notas");
        System.out.println("Primera Nota");
        double nota1 = s.nextDouble();
        System.out.println("Segunda Nota");
        double nota2 = s.nextDouble();
        System.out.println("Tercera Nota");
        double nota3 = s.nextDouble();

        double nota = (nota1 + nota2 + nota3) / 3;

        System.out.println("La media de las notas " + nota1 + " " + nota2 + " " + nota3 + " es:");
        if (nota >= 6) {
            System.out.printf("%.2f", nota);
            System.out.println(" Sobresaliente");
        } else if (nota >= 5 && nota < 6) {
            System.out.printf("%.2f", nota);
            System.out.println(" Bien");
        } else if (nota >= 4 && nota < 5) {
            System.out.printf("%.2f", nota);
            System.out.println(" Suficiente");
        } else if (nota > 0 && nota < 4) {
            System.out.printf("%.2f", nota);
            System.out.println(" Insuficiente");
        }
    }
}
