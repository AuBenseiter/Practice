package home.myhome.bucle;

public class Sustraccion {

    public static void main(String[] args) {
        for (int i = 320; i > 160; i -= 20) {
            System.out.println(i);
        }
        int i = 320;
        while (i >= 160) {
            System.out.println(i);
            i -= 20;
        }
        int a = 320;
        do {
            System.out.println(a);
            a -= 20;
        } while (a >= 160);
    }
}

