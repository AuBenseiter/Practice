package home.myhome.condicional;

import java.util.Scanner;

public class Hora {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Por favor, introduzca una hora del dia (0 - 23");
        int hora = s.nextInt();
        
        if (hora >= 6 && hora <= 12) {
            System.out.println("Buenos dias");
        }else if (hora >= 13 && hora<= 20) {
            System.out.println("Buenas tardes");
        }else if (hora >= 21 && hora < 24 || hora <= 5 && hora  >= 0) {
            System.out.println("Buenas noches");
        }else{
            System.out.println("Hora introducida no valida");
        }
        
    }
}
