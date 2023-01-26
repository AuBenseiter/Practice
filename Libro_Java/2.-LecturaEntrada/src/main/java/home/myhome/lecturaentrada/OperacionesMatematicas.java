package home.myhome.lecturaentrada;

import java.util.Scanner;

public class OperacionesMatematicas {

    public static void main(String[] args) {
        System.out.println("Operaciones Matematicas");
        System.out.println("Introduce dos numero: \n");
        Scanner s = new Scanner(System.in);
        double x1 = s.nextDouble();
        double x2 = s.nextDouble();
        double suma = x1+x2;
        double resta = x1 - x2;
        double multi = x1 * x2;
        double divi = x1 / x2;
        System.out.println("Los numeros son: " +x1+" y " +x2);
        System.out.println("La suma es: " + suma
                + " \nLa resta es: " + resta 
                + "\nLa Multiplicacion es: " + multi
                + "\nLa Division es: " + divi);
    }
}
