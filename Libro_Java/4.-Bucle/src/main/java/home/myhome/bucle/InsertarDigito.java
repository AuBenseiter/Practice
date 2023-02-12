package home.myhome.bucle;

import java.util.Scanner;

public class InsertarDigito {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduzca un numero entero positivo: ");
        long numeroIntroducido = s.nextLong();
        
        System.out.println("Introduzca la posicion donde quiere insertar: ");
        long posicion = s.nextLong();
        
        System.out.println("Introduzca el digito que quiere insertar: ");
        long digito = s.nextLong();
        
        long numero = numeroIntroducido;
        
        //calcula la longitud del digito////////////////////////////
        int longitud = 0;
        
        do {
            numero /= 10;
            longitud++;
        } while (numero> 0);
        
        //parteizquierda con el digito pegado ////////////////////
        long parteIzquierda = numeroIntroducido / (long)(Math.pow(10, longitud - posicion + 1));
        parteIzquierda = parteIzquierda * 10 + digito;
        
        //parte derecha
        long parteDerecha = numeroIntroducido % (long)(Math.pow(10, longitud - posicion +1));
        //resultado
        numero = parteIzquierda * (long)(Math.pow(10, longitud - posicion +1)) + parteDerecha;
        System.out.println("El numero resultante es " + numero);
                
    }
}
