package home.myhome.mavenproject3;

public class TresApuestas {

    public static void main(String[] args) {
        int resultadoPartido;
        int columnas = 3;

        for (int fila = 1; fila <= 14; fila++) {
            System.out.printf("%2d. |", fila);
            for (int apuesta = 1; apuesta <= columnas; apuesta++) {
                resultadoPartido = (int) (Math.random() * 3) + 1;
                switch (resultadoPartido) {
                    case 1 -> {
                        System.out.print("1  |");
                    }
                    case 2 -> {
                        System.out.print("  2|");
                    }
                    case 3 -> {
                        System.out.print(" X |");
                    }
                    default -> {
                    }
                }
            }
            System.out.println();
        }
        //pleno al 15
        System.out.println("|n PLENO AL 15 LOCAL....");
        int goles = (int) (Math.random() * 4);
        System.out.print(goles < 3 ? goles : "M");

        System.out.print("   Visitante...");
        goles = (int) (Math.random() * 4);
        System.out.print(goles < 3 ? goles : "M");
    }
}
