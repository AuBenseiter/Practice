package home.myhome.bucle;

import java.util.Scanner;

public class PintarLetraA {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduzca la altura de la A (un numero mayot o iagual a 3): ");
        int altura = s.nextInt();

        if (altura < 3) {
            System.out.println("La altura introducida no es correcta.");
        } else {
            System.out.println("Introduca la fila del palito horizontal (entre 2 y " + (altura - 1) + "): ");
            int palito = s.nextInt();
            if ((palito < 2) || (palito >= altura)) {
                System.out.println("La fila introducida no es correcta");
            } else {
                //Pinta la letra A
                int espaciosIzq = altura - 1;
                int espaciosCentro = 1;

                for (int fila = 1; fila <= altura; fila++) {
                    repiteCaracter(" ", espaciosIzq--);
                    System.out.print("*");
                    if (fila > 1) {
                        if (fila == palito) {
                            repiteCaracter("*", espaciosCentro);
                        } else {
                            repiteCaracter(" ", espaciosCentro);
                        }

                        espaciosCentro += 2;
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }

    }

    public static void repiteCaracter(String c, int n) {
        for (int j = 0; j < n; j++) {
            System.out.print(c);
        }
    }
}
