package home.myhome.bucle;

import java.util.Scanner;

public class GusanoComeOchoCero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca un numero entrero (mayor que cero): ");
        int numeroIntroducido = s.nextInt();
        
        int numero = numeroIntroducido;
        int volteado = 0;
        boolean numeroComido = false;
        
        //Al mismo tiempo que da la vuelta el numero
        //Se quitan los 0 y 8
        
        while(numero > 0){
            if ((numero% 10 != 0) && (numero % 10 != 8)) {
                volteado = (volteado *10) + (numero % 10);
            }else{
                numeroComido = true;
            }
            numero /= 10;
        }
        
        //se le vuelve a dar la vuelta al numero
        numero = volteado;
        volteado = 0;
        
        while(numero > 0){
            volteado = (volteado * 10) + (numero % 10);
            numero /= 10;
        }
        
        if(numeroComido){
            System.out.print("Despues de haber sido comido por el gusano numerico");
            System.out.println(" se queda en " + volteado);
        }else{
            System.out.println("El gusano numerico no se da comido nindun digito");
        }
    }
}
