package home.myhome.condicional;

import java.util.Scanner;

public class Infiel {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String respuesta;
        int puntos = 0;

        System.out.println("TEST DE FIDELIDAD");
        System.out.println("Este Algorimo te dirá si hay probabilidad de que tu pareja está siendo infiel.\n");

        System.out.print("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.\n(v)erdadero o (f)also: ");
        respuesta = s.nextLine();
        if (respuesta.equals("v")) {
            puntos += 3;
        }
        System.out.print("2. Ha perdido el interés que mostraba anteriormente por ti.\n(v)erdadero o (f)also: ");
        respuesta = s.nextLine();
        if (respuesta.equals("v")) {
            puntos += 3;
        }
        System.out.print("3. No te deja que mires la agenda de su teléfono móvil.\n(v)erdadero o (f)also: ");
        respuesta = s.nextLine();
        if (respuesta.equals("v")) {
            puntos += 3;
        }
        System.out.print("4. A veces tiene llamadas que dice no querer contestar cuando estás tú delante.\n(v)erdadero o (f)also: ");
        respuesta = s.nextLine();
        if (respuesta.equals("v")) {
            puntos += 3;
        }
        System.out.print("5. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo.\n(v)erdadero o (f)also: ");
        respuesta = s.nextLine();
        if (respuesta.equals("v")) {
            puntos += 3;
        }
        // Muestra el resultado del test
        if (puntos <= 5) {
            System.out.print("\n¡Enhorabuena! tu pareja parece ser totalmente fiel.");
        }

        if ((puntos > 5) && (puntos <= 7)) {
            System.out.print("\nQuizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
        }

        if (puntos >= 8) {
            System.out.print("\nTu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües qué es lo que está pasando por su cabeza.");
        }
    }
}
