package home.myhome.lecturaentrada;

import java.util.Scanner;

public class VolumenCono {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Este Algoritmo Calcula el Volumen de un Cono");
        System.out.println("Introduce el RADIO");
        double x1 = s.nextDouble();
        System.out.println("Introduce la ALTURA");
        double x2 = s.nextDouble();
        
        
        
        System.out.println("El volumen del CONO de RADIO: " +x1+ " y ALTURA " + x2 + " es: " + (Math.PI*x2*Math.pow(x1, 2))/3 );
    }
}
