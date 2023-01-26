package home.myhome.lecturaentrada;

import java.util.Scanner;

public class SalarioSemanal {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Este Algoritmo Calcula el salario semanal");
        System.out.println("Se paga 12 euros la hora, introduzca las horas trabajadas \n");
        int horas = s.nextInt();
        
        System.out.println("Tras trabajar " + horas + "Se pagaran: " + horas*12);
    }
}
