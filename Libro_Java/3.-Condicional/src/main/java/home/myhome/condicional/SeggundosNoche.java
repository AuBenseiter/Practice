package home.myhome.condicional;

import java.util.Scanner;

public class SeggundosNoche {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Algoritmo que calcula los segundos que faltan para media noche");
        System.out.println("Introduzca la hora");
        int hora = s.nextInt();
        System.out.println("Introduzca los minutos");
        int minuto = s.nextInt();
        
        int transcurrido = (hora*3600) + (minuto*60);
        int mediaNoche = (24*3600) - transcurrido;
        
        System.out.printf("Desde la %02d:%02d hasta la medianoche faltan %d segundos.", hora, minuto, mediaNoche);
    }
}
