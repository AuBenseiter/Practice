package home.myhome.condicional;

import java.util.Scanner;

public class PrecioDesayuno {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String pitufo = "";
        String resultado = "";
        double precioComida = 0;
        double precioBebida = 0;

        System.out.println("Que ha tomade de comer (palmera, donut o pitufo): ");
        String comida = s.next().toLowerCase();

        if (comida.equals("pitufo")) {
            System.out.println("Con que se ha tomado el pitufo? (aceite o tortilla): ");
            pitufo = s.next().toLowerCase();

            if (pitufo.equalsIgnoreCase("aceite")) {
                resultado = "pitudo con aceite 1.20 CLP";
                precioComida = 1.20;
            } else if (pitufo.equalsIgnoreCase("tortilla")) {
                resultado = "Pitufo con tortilla 1.60 CLP";
                precioComida = 1.60;
            }
        } else if (comida.equalsIgnoreCase("palmera")) {
            resultado = "Palmera: 1.40 CLP";
            precioComida = 1.40;
        } else if (comida.equalsIgnoreCase("donut")) {
            resultado = "Donut: 1.00 CLP";
            precioComida = 1;
        }

        System.out.println("Que ha tomado de beber? (zumo o cafe)");
        String bebida = s.next();

        if (bebida.equalsIgnoreCase("zumo")) {
            resultado += "\nZumo: 1.50 CLP";
            precioBebida = 1.50;
        } else if (bebida.equalsIgnoreCase("cafe")) {
            resultado += "\nCade: 1.20 CLP";
            precioBebida = 1.20;
        }

        System.out.println(resultado);
        System.out.printf("Total desatuno: %.2f CLP\n", precioComida + precioBebida);
    }
}
