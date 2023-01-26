package home.myhome.bucle;

public class multiplosdeCinco {

    public static void main(String[] args) {
        System.out.println("Este Algoritmo muestra lo multiplos de 5");
        for (int i = 0; i < 100; i += 5) {
            System.out.println(i);
        }
        int i = 0;
        while (i <= 100) {
            System.out.println(i);
            i += 5;
        }
        int a =0;
        do {
            System.out.println(a);
            a += 5;
        } while (a <= 100);
    }

}
