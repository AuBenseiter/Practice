package home.myhome.mavenproject3;

public class BarajaEspanhola {

    public static void main(String[] args) {
        String palo = "";
        String carta = "";
        
         int numeroPalo = (int) (Math.random() * 4) + 1;

        switch (numeroPalo) {
            case 0 ->
                palo = "oros";
            case 1 ->
                palo = "copas";
            case 2 ->
                palo = "bastos";
            case 3 ->
                palo = "espadas";
            default -> {
            }
        }

        int numeroCarta = (int) (Math.random() * 11) + 1;

        switch (numeroCarta) {
            case 1 -> {
                carta = "AS";
            }
            case 8 -> {
                carta = "Sota";
            }
            case 9 -> {
                carta = "Caballo";
            }
            case 10 -> {
                carta = "Rey";
            }
            default -> {
                carta = String.valueOf(numeroCarta);
            }
        }
        System.out.println(carta + " de " + palo);
    }
}
