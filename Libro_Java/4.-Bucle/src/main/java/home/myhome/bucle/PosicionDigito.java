package home.myhome.bucle;

import java.util.Scanner;

public class PosicionDigito {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca un numero entero: ");
        long numeroIntroducido = s.nextInt();
        
        System.out.println("Introduzca un digito ");
        int digito = s.nextInt();
        
        System.out.print("Contando de izquierda a derecha, el " + digito );
        System.out.println(" aparece dentro de " + numeroIntroducido);
        System.out.print(" en la siguientes posiciones: ");
        
        //se hace una copia del numero introducido
        long numero = numeroIntroducido;
        
        //Anhade un 1 al final po si el numero introducido termina en ceros
        //por ej. 10, 1000, etc.
        numero = numero * 10 + 1;
        
        // le da la vuelta al numero y calcula la longitud
        
        long volteado = 0;
        int longitud = 0;
        int posicion = 1;
        
        if (numero == 0) {
            longitud = 1;            
        }
        while(numero >0){
            volteado = (volteado * 10) + (numero % 10);
            numero /= 10;
            longitud++;
        }
        //comprueba la posicion
        while(volteado != 1){
            if ((volteado % 10) == digito) {
                System.out.print(posicion + " ");
            }
            volteado /= 10;
            posicion++;
        }
        System.out.println();
    }
}
