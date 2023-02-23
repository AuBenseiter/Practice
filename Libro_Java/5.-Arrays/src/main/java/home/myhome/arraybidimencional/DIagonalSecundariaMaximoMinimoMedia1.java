package home.myhome.arraybidimencional;

public class DIagonalSecundariaMaximoMinimoMedia1 {

    public static void main(String[] args) {
        int[][] n = new int[10][10];

        //Genera Array
        System.out.println("Array Original");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                n[i][j] = (int) (Math.random() * 401) + 500;
                System.out.printf("%5d", n[i][j]);
            }
            System.out.println();
        }

        System.out.print("\nDiagonal desde la esquina superior izquierda ");
        System.out.println("a la esquina inferior derecha: ");

        int maximo = 500;
        int minimo = 900;
        int suma = 0;

        for (int i = 0; i < 9; i++) {
            int numero = n[8 - i][i];
            System.out.print(numero + " ");
            if (numero > maximo) {
                maximo = numero;
            }
            if (numero < minimo) {
                minimo = numero;
            }
            suma += numero;
        }

        System.out.println("\nMáximo: " + maximo);
        System.out.println("Mínimo: " + minimo);
        System.out.println("Media: " + ((double) suma / 10));

    }
}
