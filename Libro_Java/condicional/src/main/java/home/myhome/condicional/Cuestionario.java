package home.myhome.condicional;

import java.util.Scanner;

public class Cuestionario {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int puntos = 0;
        String respuesta;

        System.out.println("CUESTIONARIO");

        System.out.println("1. ¿Cuál de los siguientes tipos de datos de Java tiene más precisión?");
        System.out.println("a) int\nb) double\nc) float");
        System.out.print("=> ");
        respuesta = s.nextLine();
        if (respuesta.equals("b")) {
            puntos++;
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
        
        System.out.println("2. En que estado esta el queso?");
        System.out.println("a) descomposicion\nb) liquido\nc) solido");
        System.out.print("=> ");
        respuesta = s.nextLine();
        if (respuesta.equals("a")) {
            System.out.println("Correcto");
            puntos++;
        }else{
            System.out.println("Incorrecto");
        }

        

        System.out.println("\nHa obtenido " + puntos + " puntos.");
    }
}
