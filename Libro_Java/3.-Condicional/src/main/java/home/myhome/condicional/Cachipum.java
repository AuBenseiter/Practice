package home.myhome.condicional;

import java.util.Scanner;

public class Cachipum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Turno del jugador 1 (Introduzaca piedra, papel o tijera): ");
        String jugador1 = s.next();
        
        System.out.println("Turno del jugador 2 (Introduzaca piedra, papel o tijera): ");
        String jugador2 = s.next();
        
        if (jugador1.equals(jugador2)) {
            System.out.println("Empate");
            }else{
            int ganador = 2;
            switch(jugador1){
                case "piedra" -> {
                    if (jugador2.equals("tijera")) {
                        ganador = 1;
                    }
                }
                case "papel" -> {
                    if (jugador2.equals("piedra")) {
                        ganador = 1;
                    }
                }
                case "tijera" -> {
                    if (jugador2.equals("papel")) {
                        ganador = 1;
                    }
                }
                default -> {}
            }
            System.out.println("Gana el jugador " + ganador);
        }
    }
}
