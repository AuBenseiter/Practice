package home.myhome.mavenproject3;


public class NotasGeneradasAlAzar {

    public static void main(String[] args) {
        int nota;
        int suspensos = 0;
        int suficientes = 0;
        int bienes = 0;
        int notables = 0;
        int sobresalientes = 0;

        for (int i = 0; i < 20; i++) {
            nota = (int) (Math.random() * 5);

            switch (nota) {
                case 0 -> {
                    System.out.println("suspenso ");
                    suspensos++;
                }
                case 1 -> {
                    System.out.println("suficiente ");
                    suficientes++;
                }
                case 2 -> {
                    System.out.println("bien ");
                    bienes++;
                }
                case 3 -> {
                    System.out.println("notable ");
                    notables++;
                }
                case 4 -> {
                    System.out.println("sobresaliente ");
                    sobresalientes++;
                }
                default -> {
                }
            }

        }
        System.out.println("\nNº de suspensos: " + suspensos);
        System.out.println("Nº de suficientes: " + suficientes);
        System.out.println("Nº de bienes: " + bienes);
        System.out.println("Nº de notables: " + notables);
        System.out.println("Nº de sobresalientes: " + sobresalientes);
    }
}
