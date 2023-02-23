package home.myhome.arrayunidimensional;

public class TresArrayNumCuadradoCubo {
    public static void main(String[] args) {
        int [] numero = new int[20];
        int [] cuadrado = new int[20];
        int [] cubo = new int[20];
        
        for (int i = 0; i < 20; i++) {
            numero[i] = (int)(Math.random()*101);
            cuadrado[i] = numero[i] * numero[i];
            cubo[i] = cuadrado[i] * cubo[i];
        }
        
        System.out.println("  n  │   n²  │    n³\n-----|-------|--------");
        for (int i = 0; i < 20; i++) {
            System.out.printf("%4d | %5d |%8d\n", numero[i], cuadrado[i], cubo[i]);
        }
    }
}
