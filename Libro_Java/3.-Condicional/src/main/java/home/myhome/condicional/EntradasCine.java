package home.myhome.condicional;

import java.util.Scanner;

public class EntradasCine {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Venta de entrada CineCompa");

        System.out.println("Numero ded entradas: ");
        int entradas = s.nextInt();

        System.out.println("Dia de la semana: ");
        String dia = s.next();

        System.out.println("Tiene tarjeta CineCompa? (S/N)");
        boolean tieneTarjeta = (s.next()).toLowerCase().equals("s");

        int entradasIndividuales = entradas;
        double precioEntradaIndividual = 8;
        int entradasDePareja = 0;
        double total = 0;
        double descuento = 0;
        double aPagar = 0;

        switch (dia) {
            case "miercoles" ->
                precioEntradaIndividual = 5;
            case "jueves" -> {
                entradasDePareja = entradas / 2;
                entradasIndividuales = entradas % 2;
            }
            default -> {
            }
        }
        total = precioEntradaIndividual * entradasIndividuales;
        total += 11 * entradasDePareja;

        if (tieneTarjeta) {
            descuento = total * 0.1;
        }
        aPagar = total - descuento;

        System.out.println("\nAqui tiene sus entrada. Gracias por su compra");

        if (entradasDePareja > 0) {
            System.out.printf("Entradas de pareja              %2d\n", entradasDePareja);
            System.out.printf("Precio por entrada de Pareja    %5.2f CLP\n", 11.0);
        }

        if (entradasIndividuales > 0) {
            System.out.printf("Entradas individuales         %2d\n", entradasIndividuales);
            System.out.printf("Precio por entrada individual %5.2f €\n", precioEntradaIndividual);
        }

        System.out.printf("Total                         %5.2f €\n", total);
        System.out.printf("Descuento                     %5.2f €\n", descuento);
        System.out.printf("A pagar                       %5.2f €\n", aPagar);
    }
}
