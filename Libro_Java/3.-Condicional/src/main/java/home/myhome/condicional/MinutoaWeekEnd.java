package home.myhome.condicional;

import java.util.Scanner;

public class MinutoaWeekEnd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("introdusca un dia de la semana");
        String dia = s.nextLine();
        int diaNumerico = 0;
        switch(dia){
            case "lunes" -> diaNumerico = 0;
            case "martes" -> diaNumerico = 1;
            case "miercoles" -> diaNumerico = 2;
            case "jueves" -> diaNumerico = 3;
            case "viernes" -> diaNumerico = 4;
            default -> System.out.println("El dia introducido no es correcto");
        }
        System.out.println("Introduzca la hora (hora y minutos)");
        System.out.println("Horas: ");
        int horas = s.nextInt();
        System.out.println("Minutos");
        int minutos = s.nextInt();
        
        int minutosTotales = ( 4 * 24 * 60) + (15 * 60);
        int minutosActuales = (diaNumerico * 24 * 60) + (horas * 60) + minutos;
        
        System.out.println("Faltan " + (minutosTotales - minutosActuales) + "minutos para llegar al fin de semana");
    }
}
