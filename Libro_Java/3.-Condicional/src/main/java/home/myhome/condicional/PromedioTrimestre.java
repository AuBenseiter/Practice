package home.myhome.condicional;

import java.util.Scanner;

public class PromedioTrimestre {
    public static void main(String[] args) {
        System.out.println("Nota del primer control: ");
        Scanner s = new Scanner(System.in);
        double n1 = s.nextDouble();
        
        System.out.println("Nota del segundo control: ");
        double n2 = s.nextDouble();
        
        double media = (n1 + n2)/2;
        
        if (media < 5) {
            System.out.println("Cual ha sido el resultado de la recuperacion (apto/no apto): ");
            //como es maven no reconose esta linea
            String recuperacion = System.console().readLine();
            if (recuperacion.equals("apto")) {
                media = 5;
            }
        }
        System.out.println("Tu nota de programacion es: " + media);
    }
}
