package home.myhome.mavenproject3;

import java.util.Scanner;

public class Cachipum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Turno del jugador (introduzca piedra, papel o tijeras): ");
        String jugador = s.next().toLowerCase();

        int mano = (int) (Math.random() * 3);
        String ordenador = "";

        switch (mano) {
            case 0 -> {
                ordenador = "piedra";
            }
            case 1 -> {
                ordenador = "papel";
            }
            case 2 -> {
                ordenador = "tijeras";
            }
            default -> {
            }
        }

        System.out.println("Turno del ordenador: " + ordenador);

        if (jugador.equals(ordenador)) {
            System.out.println("Empate");
        } else {
            int ganador = 2;
            switch (jugador) {
                case "piedra" -> {
                    if (ordenador.equals("tijera")) {
                        ganador = 1;
                    }
                }
                case "papel" -> {
                    if (ordenador.equals("piedra")) {
                        ganador = 1;
                    }
                }
                case "tijera" -> {
                    if (ordenador.equals("papel")) {
                        ganador = 1;
                    }
                }
                default -> {}
            }
            
            if (ganador == 1) {
                System.out.print("Gana el jugador");
            }else{
                System.out.print("Gana el jugador");
            }
        }
    }
}
