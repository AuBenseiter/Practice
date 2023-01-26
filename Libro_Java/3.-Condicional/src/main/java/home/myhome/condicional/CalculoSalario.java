package home.myhome.condicional;

import java.util.Scanner;

public class CalculoSalario {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sueldoSemanal;
        System.out.println("Introduzca el numero de horas trabajadas durante la semana");
        int horasTrabajadas = s.nextInt();
        if (horasTrabajadas <= 40) {
            sueldoSemanal = 12 * horasTrabajadas;
        } else {
            sueldoSemanal = (40 * 12) + ((horasTrabajadas - 40) * 16);
        }
        System.out.println("El sueldo semanal que le corresponede es de" + sueldoSemanal + " euros");
    }
}
