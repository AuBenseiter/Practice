package home.myhome.mavenproject3;

public class BarajaFrancesa {

    public static void main(String[] args) {
        String palo = "";
        String carta = "";

        int numeroPalo = (int) (Math.random() * 4) + 1;

        switch (numeroPalo) {
            case 1 ->
                palo = "picas";
            case 2 ->
                palo = "corazones";
            case 3 ->
                palo = "diamantes";
            case 4 ->
                palo = "treboles";
            default -> {
            }
        }

        int numeroCarta = (int) (Math.random() * 13) + 1;

        switch (numeroCarta) {
            case 1 -> {
                carta = "AS";
            }
            case 11 -> {
                carta = "J";
            }
            case 12 -> {
                carta = "Q";
            }
            case 13 -> {
                carta = "K";
            }
            default -> {
                carta = String.valueOf(numeroCarta);
            }
        }
        System.out.println(carta + " de " + palo);
    }
}
