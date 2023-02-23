package home.myhome.mavenproject3;

public class MontrarCienNumerosConCaracteresEspeciales {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            int numero = (int)(Math.random() * 191) + 10;
            //comprueba si el numero es primo
            boolean esPrimo = true;
            for(int j = 2; j < numero; j++){
                if ((numero % j) == 0) {
                    esPrimo = false;
                }
            }
            
            if (esPrimo) {
                System.out.print("#" + numero + "#  ");
            }else if ((numero % 5) == 0) {
                System.out.print("[" + numero + "]  ");
            }else{
                System.out.println(numero + " ");
            }
        }
    }
}
