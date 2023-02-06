package home.myhome.condicional;

import java.util.Scanner;

public class PrecioBoleta {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce la base imponible: ");
        double baseImponible = s.nextDouble();

        System.out.println("Introduzca el tipo de IVA (general, reducido o superreducido): ");
        String tipoIVA = s.next().toLowerCase();
        System.out.println("Introdusca el codigo promocional (nopromo, mitad, meno5 o 5proc): )");
        String codigoPromocional = s.next().toLowerCase();

        int tipoIVANumerico = 0;

        switch (tipoIVA) {
            case "general" ->
                tipoIVANumerico = 21;
            case "reducido" ->
                tipoIVANumerico = 10;
            case "superreducido" ->
                tipoIVANumerico = 4;
            default ->
                System.out.println("El tipo de IVA introducido no es correcto");
        }

        double iva = baseImponible * tipoIVANumerico / 100;
        double precioSinDescuento = baseImponible + iva;

        double descuento = 0;
        switch (codigoPromocional) {
            case "nopromo" -> {
            }
            case "mitad" ->
                descuento = (precioSinDescuento / 2);
            case "meno5" ->
                descuento = 5;
            case "5porc" ->
                descuento = (precioSinDescuento * 0.05);
            default ->
                System.out.println("El código promocional introducido no es correcto.");
        }

        double total = precioSinDescuento - descuento;
        System.out.printf("Base Imponible           %6.2f\n", baseImponible);
        System.out.printf("IVA (%2d%%)              %6.2f\n", tipoIVANumerico, iva);
        System.out.printf("Precio con IVA             %6.2f\n", precioSinDescuento);
        System.out.printf("Cod. promo. (%5s)       -%6.2f\n", codigoPromocional, descuento);
        System.out.printf("TOtal                            %6.2f\n", total);
    }
}
