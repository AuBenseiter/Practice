package home.myhome.bucle;

import java.util.Scanner;

public class XdeAsteriscos {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Por favor, introduzca la altura de la x");
        int alturaIntroducida = s.nextInt();

        int altura = 1;
        int i = 0;
        int espaciosInternos = alturaIntroducida - 1;
        int espaciosPorDelante = 0;

        if ((alturaIntroducida < 3) || (alturaIntroducida % 2 == 0)) {
            //inserta espacios delante////////////////////////////////////////
            System.out.print("Datos Incorrectos. Debe Introducir una altura impar moayor o iguaal a 3");
        } else {
            //parte de arriba//////////////////////////////////////////////////////
            while (altura < alturaIntroducida / 2 + 1) {
                //inserta espacios delante////////////////////////////////////////
                for (int j = 1; j <= espaciosPorDelante; j++) {
                    System.out.print(" "); 
                }
                //pinta la linea ///////////////////////////////////////////////////////
                System.out.print("*");
                for (int j = 1; j < espaciosInternos; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();   
                altura++;
                espaciosPorDelante++;
                espaciosInternos -= 2;
            }
            //parte de abajo///////////////////////////////////////////////////////////////
            espaciosInternos = 0;
            espaciosPorDelante = alturaIntroducida / 2;
            altura = 1;
            while(altura <= alturaIntroducida /2+1){
                //inserta espacios delante//////////////////////////////////////////
                for (int j = 1; j <= espaciosPorDelante; j++) {
                    System.out.print(" ");
                }
                //pinta la linea///////////////////////////////////////////////////////////
                System.out.print("*");
                for (int j = 1; j < espaciosInternos; j++) {
                    System.out.print(" ");
                }
                if (altura>1) {
                    System.out.print("*");
                }
                System.out.println();
                altura++;
                espaciosPorDelante--;
                espaciosInternos +=2;
            }
        }
    }
}
