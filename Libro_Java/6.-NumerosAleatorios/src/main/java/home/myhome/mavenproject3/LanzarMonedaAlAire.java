package home.myhome.mavenproject3;

public class LanzarMonedaAlAire {
    public static void main(String[] args) {
        String moneda = "";
        String posicion = "";
        for (int i = 0; i < 5; i++) {
            switch((int)(Math.random() * 8)){
                case 0 -> {moneda = "1 centimo";}
                case 1 -> {moneda = "2 centimo";}
                case 2 -> {moneda = "5 centimo";}
                case 3 -> {moneda = "10 centimo";}
                case 4 -> {moneda = "20 centimo";}
                case 5 -> {moneda = "50 centimo";}
                case 6 -> {moneda = "1 euro";}
                case 7 -> {moneda = "2 euros";}
                default -> {}
            }
            switch((int)(Math.random() * 2)){
                case 0 -> {posicion = "cara";}
                case 1 -> {posicion = "cruz";}
                default -> {}
            }
            System.out.println(moneda + " - " + posicion);
        }
    }
}
