package home.myhome.bucle;

public class NumerosPrimos {
    public static void main(String[] args) {
        System.out.println("Numeros primos entre 2 y 100");
        
        boolean esPrimo = true;
        
        for (int n = 2; n <= 100; n++) {
            esPrimo = true;
            //comprueba si n es primo
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    esPrimo = false;
                }
            }
            //si n es primo, se muestra por pantalla
            if (esPrimo) {
                System.out.print(n+" ");
            }
        }
        System.out.println("");
    }
}
