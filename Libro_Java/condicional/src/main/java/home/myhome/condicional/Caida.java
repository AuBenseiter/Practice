package home.myhome.condicional;

public class Caida {

    public static void main(String[] args) {
        System.out.println("Calculo de tiempo de caida de un objeto");
        System.out.println("Introduzca la altura en metro");
        Double h = Double.parseDouble(System.console().readLine());

        final double g = 9.81; //las constantes se declaran con final
        double s = Math.sqrt(2 * h/ g);

        System.out.printf("El objeto tarda %.2f segundoes en caer . \n", s);
    }
}
