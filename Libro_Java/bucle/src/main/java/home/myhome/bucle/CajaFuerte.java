package home.myhome.bucle;

import java.util.Scanner;

public class CajaFuerte {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int intentos = 4;
        int numeroIntroducido;
        boolean acertado = false;
        

        do {
            System.out.println("Introduzca la clave de la caja fuerte: ");
            numeroIntroducido = s.nextInt();
            if (numeroIntroducido == 9999) {
                acertado = true;
            }else{
                System.out.println("Clave incorrecta");
            }
            intentos --;
        }while(intentos > 0 && !acertado);
        if (acertado) {
            System.out.println("Ha abierto la caja fuert");
        }else{
            System.out.println("Lo siento, se ha agotado las 4 oportunidades");
        }
        
    }

}
