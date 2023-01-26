package home.myhome.condicional;

import java.util.Scanner;

public class EquSegGrado {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Este Algoritmo resuelve ecuaciones de segundo grado");
        System.out.println("ax^2 + bx + c = 0");
        System.out.println("Introduzca el valor de a");
        double a = s.nextDouble();
        System.out.println("Introduzca el valor de b");
        double b = s.nextDouble();
        System.out.println("Introduzca el valor de c");
        double c = s.nextDouble();

        /*0x^2 + 0x +0 = 0*/
        if (a == 0 && b == 0 && c == 0) {
            System.out.println("La ecuacion tiene infinitas soluciones");
        }

        /*0x^2 + 0x + c*/
        if (a == 0 && b == 0 && c != 0) {
            System.out.println("La ecuacion no tiene solucion");
        }
        
        /*ax^2 + bx + 0 = 0*/
        if (a != 0 && b != 0 && c == 0) {
            System.out.println("x1 = 0");
            System.out.println("x2 = " + (-b/a));
        }
        
        /*0x^2 + bx + c = 0*/
        if (a == 0 && b != 0 && c != 0) {
            System.out.println("x1 = x2 = " + (-c/b));
        }
        
        /*ax^2 + bx +c = 0*/
        if (a != 0 && b != 0 && c != 0) {
            double discriminante = b*b - (4 * a * c);
            
            if (discriminante < 0) {
                System.out.println("La ecuacion no tiene soluciones reales");
            }else{
                System.out.println("x1 = " + (-b + Math.sqrt(discriminante))/(2*a));
                System.out.println("x1 = " + (-b - Math.sqrt(discriminante))/(2*a));
            }
        }
    }
}
