package home.myhome.bucle;

import java.util.Scanner;

public class PintarRombo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduzca la altura del rombo: ");
        int alturaIntroducida = s.nextInt();
        
        int espaciosInternos = 0;
        int espaciosPorDelante = alturaIntroducida /2;
        
        if ((alturaIntroducida < 3) || (alturaIntroducida % 2 == 0)) {
            System.out.println("Datos incorrectos. Debe introducir una altura umpar mayor o igual a 3");
        }else{
            
            int altura = 1;
            
            //Parte de arriba//////////////////////////////////////////////////
            while(altura <= alturaIntroducida / 2+1){
                //inserta espacios delante/////////////////////////////
                for (int i = 1; i <= espaciosPorDelante; i++) {
                    System.out.print(" ");
                }
                //pinta la linea ///////////////////////////////////////////////
                System.out.print("*");
                for (int i = 1; i < espaciosInternos; i++) {
                    System.out.print(" ");
                }
                if (altura > 1) {
                    System.out.print("*");
                }
                System.out.println();
                altura++;
                espaciosPorDelante--;
                espaciosInternos += 2;
            }
            //parte de abajo////////////////////////////////////////////////////
            espaciosInternos = alturaIntroducida - 3;
            espaciosPorDelante = 1;
            altura = 0;
            
            while (altura < alturaIntroducida / 2){
                //inserta espacios delante//////////////////////////////
                for (int i = 1; i <= espaciosPorDelante; i++) {
                    System.out.print(" ");
                }
                
                //Pinta la linea////////////////////////////////////////////
                System.out.print("*");
                for (int i = 1; i < espaciosInternos; i++) {
                    System.out.print(" ");
                }
                if (altura < alturaIntroducida / 2-1) {
                    System.out.print("*");
                }
                
                System.out.println();
                altura++;
                espaciosPorDelante++;
                espaciosInternos -= 2;
            }
        }
        
    }
}
