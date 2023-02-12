package home.myhome.bucle;

import java.util.Scanner;

public class RelojArena {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduzca la altura del reloj de arena: ");
        int alturaIntroducida = s.nextInt();
        
        int altura = 1;
        int asteriscos = alturaIntroducida;
        int espaciosPorDelante = 0;
        
        if ((alturaIntroducida < 3) || (alturaIntroducida % 2 == 0)) {
            System.out.print("Datos incorrectos. debe introducir una altura impar mayor o iagual a 3");
        }else{
            while(altura < alturaIntroducida / 2 + 1){
                
                //inserta espacios delante//////////////////////////////////////////////////////////////////
                for (int i = 1; i <= espaciosPorDelante; i++) {
                    System.out.print(" ");
                }
                
                //pinta la linea ////////////////////////////////////////////////////////////////////////////
                for (int i = 0; i < asteriscos; i++) {
                    System.out.print("*");
                }
                
                System.out.println();
                altura++;
                espaciosPorDelante++;
                asteriscos -=2;
            }
            
            //parte de abajo/////////////////////////////////////////////////////////////////////////////////
            espaciosPorDelante = alturaIntroducida /2;
            altura = 1;
            while(altura <= alturaIntroducida /2 +1){
                //inserta espacios delante/////////////////////////////////////////////////
                for (int i = 1; i <= espaciosPorDelante; i++) {
                    System.out.print(" ");
                }
                //pinta la linea////////////////////////////////////////
                for (int i = 0; i < asteriscos; i++) {
                    System.out.print("*");
                }
                
                System.out.println();
                altura++;
                espaciosPorDelante--;
                asteriscos += 2;
            }
                
        }
    }
    
}
