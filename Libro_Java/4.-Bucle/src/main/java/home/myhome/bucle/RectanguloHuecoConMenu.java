package home.myhome.bucle;

import java.util.Scanner;

public class RectanguloHuecoConMenu {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int ancho = 6;
        int alto = 3;

        int opcion = 0;

        do {
            //pinta el rectangulo
            for (int i = 0; i < ancho; i++) {
                System.out.print("*");
            }
            System.out.println();
            
            for (int i = 0; i < alto - 2; i++) {
                System.out.print("*");
                for (int j = 0; j < ancho - 2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }

            for (int i = 0; i < ancho; i++) {
                System.out.print("*");
            }
            System.out.println();

            //Menu
            System.out.println("1. Agrandarlo");
            System.out.println("2. Achicarlo");
            System.out.println("3. Cambiar la orientación");
            System.out.println("4. Salir");
            System.out.print("Indique qué quiere hacer con el rectángulo: ");
            opcion = s.nextInt();
            
            switch(opcion){
                case 1 -> {
                    ancho++;
                    alto++;
                }
                case 2 -> {
                    if ((ancho> 2) && (alto > 2)) {
                        ancho--;
                        alto--;
                    }else{
                        System.out.println("El rectangulo no se puece achicar mas");
                    }
                }
                case 3 -> {
                    int aux = ancho;
                    ancho = alto;
                    alto = aux;
                }                
                default -> {}
            }
            System.out.println();

        } while (opcion != 4);
    }
}
