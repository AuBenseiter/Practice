package home.myhome.condicional;

import java.util.Scanner;

public class DiaSemana {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String dia;
        System.out.println("Introduzca un numero del 1 al 7");
        int n = s.nextInt();

        switch (n) {
            case 1:
                dia = "lunes";
                break;
            case 2:
                dia = "martes";
                break;
            case 3:
                dia = "miercoles";
                break;
            case 4:
                dia = "jueves";
                break;
            case 5:
                dia = "viernes";
                break;
            case 6:
                dia = "sabado";
                break;
            case 7:
                dia = "domingo";
                break;
            default:
                dia = "Introduce un numero del 1 al 7";
        }
        System.out.println(dia);
    }
//    dia = switch (n) {
//            case 1 -> "lunes";
//            case 2 -> "martes";
//            case 3 -> "miercoles";
//            case 4 -> "jueves";
//            case 5 -> "viernes";
//            case 6 -> "sabado";
//            case 7 -> "domingo";
//            default -> "Introduce un numero del 1 al 7";
}
