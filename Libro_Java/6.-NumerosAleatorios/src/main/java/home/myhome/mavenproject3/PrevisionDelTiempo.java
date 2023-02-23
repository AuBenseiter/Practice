package home.myhome.mavenproject3;

import java.util.Scanner;

public class PrevisionDelTiempo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("1. Primavera");
        System.out.println("2. Verano");
        System.out.println("3. Otoño");
        System.out.println("4. Invierno");
        System.out.print("Seleccione la estación del año (1-4): ");
        int estacion = s.nextInt();

        int temperaturaMinima = 0;
        int temperaturaMaxima = 0;
        String cielo = "";
        switch (estacion) {
            case 1 -> {
                temperaturaMinima = (int) (Math.random() * 16 + 15);
                temperaturaMaxima = (int) (Math.random() * 16 + 15);
                cielo = Math.random() <= 0.6 ? "soleado" : "nublado";
            }
            case 2 -> {
                temperaturaMinima = (int) (Math.random() * 21 + 25);
                temperaturaMaxima = (int) (Math.random() * 21 + 25);
                cielo = Math.random() <= 0.86 ? "soleado" : "nublado";
            }
            case 3 -> {
                temperaturaMinima = (int) (Math.random() * 11 + 20);
                temperaturaMaxima = (int) (Math.random() * 11 + 20);
                cielo = Math.random() <= 0.4 ? "soleado" : "nublado";
            }
            case 4 -> {
                temperaturaMinima = (int) (Math.random() * 26);
                temperaturaMaxima = (int) (Math.random() * 26);
                cielo = Math.random() <= 0.2 ? "soleado" : "nublado";
            }
            default -> {
                System.out.println("La estacion seleccionada no es correcta");
            }
        }
        //si la minima es mayor, se intercambian temperaturas
        if (temperaturaMinima > temperaturaMaxima) {
            int aux = temperaturaMinima;
            temperaturaMinima = temperaturaMaxima;
            temperaturaMaxima = aux;
        }
        System.out.println("\nPrevisión del tiempo para mañana");
        System.out.println("--------------------------------");
        System.out.println("Temperatura mínima: " + temperaturaMinima);
        System.out.println("Temperatura máxima: " + temperaturaMaxima);
        System.out.println(cielo);
    }
}
