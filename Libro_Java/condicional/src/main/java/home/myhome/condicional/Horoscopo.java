package home.myhome.condicional;

import java.util.Scanner;

public class Horoscopo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Este algoritmo muestra tu signo sodiacal");
        String horoscopo;
        System.out.println("Introduzca el mes (forma de numero)");
        int mes = s.nextInt();
        System.out.println("intoduzca el dia (forma de numero)");
        int dia = s.nextInt();
        switch (mes) {
            case 1 -> {
                if (dia < 21) {
                    horoscopo = "capricornio";
                } else {
                    horoscopo = "acuario";
                }
            }
            case 2 -> {
                if (dia < 21) {
                    horoscopo = "acuario";
                } else {
                    horoscopo = "piscis";
                }
            }
            case 3 -> {
                if (dia < 21) {
                    horoscopo = "piscis";
                } else {
                    horoscopo = "aries";
                }
            }
            case 4 -> {
                if (dia < 21) {
                    horoscopo = "aries";
                } else {
                    horoscopo = "tauro";
                }
            }
            case 5 -> {
                if (dia < 21) {
                    horoscopo = "tauro";
                } else {
                    horoscopo = "geminis";
                }
            }
            case 6 -> {
                if (dia < 21) {
                    horoscopo = "geminis";
                } else {
                    horoscopo = "cancer";
                }
            }
            case 7 -> {
                if (dia < 21) {
                    horoscopo = "cancer";
                } else {
                    horoscopo = "leo";
                }
            }
            case 8 -> {
                if (dia < 21) {
                    horoscopo = "leo";
                } else {
                    horoscopo = "virgo";
                }
            }
            case 9 -> {
                if (dia < 21) {
                    horoscopo = "virgo";
                } else {
                    horoscopo = "libra";
                }
            }
            case 10 -> {
                if (dia < 21) {
                    horoscopo = "libra";
                } else {
                    horoscopo = "escorpio";
                }
            }
            case 11 -> {
                if (dia < 21) {
                    horoscopo = "escorpio";
                } else {
                    horoscopo = "sagitario";
                }
            }
            case 12 -> {
                if (dia < 21) {
                    horoscopo = "sagitario";
                } else {
                    horoscopo = "capricornio";
                }
            }
            
        }
    }
}
