package home.myhome.lecturaentrada;

import java.util.Scanner;

public class EcuacionesSegundoGrado {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Este programa resuelve ecuaciones de segundo grado");
        System.out.println("Ingrese a, b y c");
        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();

        double disc = Math.sqrt(Math.pow(b, 2) - (4 * a * c));
        double resultOne = ((-b) + disc) / 2 * a;
        double resultTwo = ((-b) - disc) / 2 * a;
        double p1 = (-b / (2 * a));
        double p2 = a * Math.pow((-b / (2 * a)), 2) + b * (-b / (2 * a)) + c;

        if (a == 0 && b == 0 && c == 0) {
            System.out.println("la ecuacion tiene soluciones infinitas");
        } else if (a != 0 && b != 0 && c != 0) {
            if (disc > 0) {
                System.out.println("Tiene dos soluciones");
                System.out.printf("Soluciones: %.2f y %.2f", resultOne, resultTwo);
                System.out.printf("Vertice (%.2f , %.2f", p1, p2);
            } else if (disc < 0) {
                System.out.println("No tiene soluciones en los REALES");
            } else if (disc == 0) {
                System.out.println("Solo tiene una solucion");
            }
        }else if (a == 0 && b == 0 && c != 0) {
            System.out.println("La ecuacion no tiene solucion");
        }else if (a != 0 && b != 0 && c == 0) {
            if (disc > 0) {
                System.out.println("Tiene dos soluciones");
                System.out.printf("Soluciones: %.2f y %.2f", resultOne, resultTwo);
                System.out.printf("Vertice (%.2f , %.2f", p1, p2);
            } else if (disc < 0) {
                System.out.println("No tiene soluciones en los REALES");
            } else if (disc == 0) {
                System.out.println("Solo tiene una solucion");
            }
        }else if (a == 0 && b != 0 && c != 0) {
            if (disc > 0) {
                System.out.println("Tiene dos soluciones");
                System.out.printf("Soluciones: %.2f y %.2f", resultOne, resultTwo);
                System.out.printf("Vertice (%.2f , %.2f", p1, p2);
            } else if (disc < 0) {
                System.out.println("No tiene soluciones en los REALES");
            } else if (disc == 0) {
                System.out.println("Solo tiene una solucion");
            }
        }
    }
}
