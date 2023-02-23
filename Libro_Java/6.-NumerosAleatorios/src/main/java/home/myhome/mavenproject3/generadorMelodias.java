package home.myhome.mavenproject3;

public class generadorMelodias {

    public static void main(String[] args) {
        int notas = 4 * (int) (Math.random() * 7 + 1);
        String nota = "";
        String primeraNota = "";

        for (int contadorNota = 1; contadorNota <= notas; contadorNota++) {
            switch ((int) (Math.random() * 7)) {
                case 0 -> {
                    nota = "do";
                }
                case 1 -> {
                    nota = "re";
                }
                case 2 -> {
                    nota = "mi";
                }
                case 3 -> {
                    nota = "fa";
                }
                case 4 -> {
                    nota = "sol";
                }
                case 5 -> {
                    nota = "la";
                }
                case 6 -> {
                    nota = "si";
                }
                default -> {
                }
            }

            if (contadorNota == 1) {
                primeraNota = nota;
            }

            if (contadorNota == notas) {
                nota = primeraNota;
            }
            System.out.print(nota + " ");

            if (contadorNota == notas) {
                System.out.print("||");
            } else if (contadorNota % 4 == 0) {
                System.out.print("| ");
            }
        }
    }
}
