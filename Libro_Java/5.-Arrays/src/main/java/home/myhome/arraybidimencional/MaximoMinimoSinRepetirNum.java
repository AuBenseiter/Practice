package home.myhome.arraybidimencional;

public class MaximoMinimoSinRepetirNum {

    public static void main(String[] args) throws InterruptedException {
        int[][] num = new int[6][10];

        int fila;
        int columna;

        //generar el contenido del array sin que se repita ningn valor
        boolean repetido;

        for (fila = 0; fila < 6; fila++) {
            for (columna = 0; columna < 10; columna++) {
                do {
                    num[fila][columna] = (int) (Math.random() * 1001);
                    //comprueba si el numero generado ya esta en el array
                    repetido = false;
                    for (int i = 0; i < 10 * fila + columna; i++) {
                        if (num[fila][columna] == num[i / 10][i % 10]) {
                            repetido = true;
                        }
                    }
                } while (repetido);

            }
        }

        int minimo = Integer.MAX_VALUE;
        int filaMinimo = 0;
        int columnaMinimo = 0;

        int maximo = Integer.MIN_VALUE;
        int filaMaximo = 0;
        int columnaMaximo = 0;
        
         System.out.print("\n      ");
        for (columna = 0; columna < 10; columna++) {
            System.out.print("   " + columna + "  ");
        }
        System.out.println();
        
        System.out.print("    ┌");
        for (columna = 0; columna < 10; columna++) {
            System.out.print("──────");
        }
        System.out.println("┐");
        
        //Generacion de matriz
        for (fila = 0; fila < 6; fila++) {
            System.out.print("  " + fila + " │");
            for (columna = 0; columna < 10; columna++) {
                //num[fila][columna] = (int) (Math.random() * 1001);
                System.out.printf("%5d ", num[fila][columna]);
                Thread.sleep(100);

                //Calcula el minimo y guar sus cordenadas
                if (num[fila][columna] < minimo) {
                    minimo = num[fila][columna];
                    filaMinimo = fila;
                    columnaMinimo = columna;
                }

                //Calcula el maximo y guarda sus cordenadas
                if (num[fila][columna] > maximo) {
                    maximo = num[fila][columna];
                    filaMaximo = fila;
                    columnaMaximo = columna;
                }
            }
            System.out.println("│");
        }
        System.out.print("    └");
        for (columna = 0; columna < 10; columna++) {
            System.out.print("──────");
        }

        System.out.println("┘\n\nEl máximo es " + maximo + " y está en la fila " + filaMaximo + ", columna " + columnaMaximo);
        System.out.println("El mínimo es " + minimo + " y está en la fila " + filaMinimo + ", columna " + columnaMinimo);
    }
}
