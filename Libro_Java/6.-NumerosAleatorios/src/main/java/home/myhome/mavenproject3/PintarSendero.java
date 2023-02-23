package home.myhome.mavenproject3;

import java.util.Scanner;

public class PintarSendero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduzca la longitud del sendero en metros: ");
        int longitudSendero = s.nextInt();

        int espaciosPorDelante = 6;

        for (int i = 0; i < longitudSendero; i++) {
            for (int j = 0; j < espaciosPorDelante; j++) {
                System.out.print("");
            }
            //borde izquierdo del sendero
            System.out.print('|');
            //parte inferior del sendero
            int posicionObstaculo = -1;
            char obstaculo = '*';
            if ((int) (Math.random() * 2) == 0) {
                posicionObstaculo = (int) (Math.random() * 4);
                if ((int) (Math.random() * 2) == 0) { // piedra
                    obstaculo = 'O';
                }
            }
            for (int j = 0; j < 4; j++) {
                System.out.print(j == posicionObstaculo ? obstaculo : ' ');
            }
            //borde derecho del sendero
            System.out.println('|');

            espaciosPorDelante += (int) (Math.random() * 3) - 1;
        }
    }
}
