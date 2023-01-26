package home.myhome.lecturaentrada;

import java.util.Scanner;

public class NotaTrimestre {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Algoritmo que calcula la nota del segundo examen");
        System.out.println("Introduzca la nota del primer examen: ");
        double nota1 = s.nextDouble();
        System.out.println("Que nota quieres sacar en el examen 2");
        double notaFinal = s.nextDouble();
        double nota2 = ((notaFinal * 100) - (nota1 * 40)) / 60;
        
        System.out.println("Para tener un " + notaFinal + " en el trimestre");
        System.out.println(" necesitas sacar un " + nota2 + " en el segundo examen.");
    }
}
