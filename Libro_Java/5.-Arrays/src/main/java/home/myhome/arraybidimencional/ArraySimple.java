package home.myhome.arraybidimencional;

public class ArraySimple {

    public static void main(String[] args) {
        int[][] num = new int[3][6];

        num[0][0] = 4;
        num[0][1] = 3;
        num[0][2] = 23;
        num[0][5] = 73;
        num[1][0] = 7;
        num[1][4] = 23;
        num[2][2] = -2;
        num[2][3] = 12;
        num[2][5] = 1;
        
        int fila;
        int columna;
        
        for (columna = 0; columna < 6; columna++) {
            System.out.print("   Columna " + columna);
        }
        for (fila = 0; fila < 3; fila++) {
            System.out.print("\nFila " + fila);
        }
        for (int i = 0; i < 10; i++) {
            
        }
    }
}
