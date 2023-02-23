package home.myhome.mavenproject3;

public class AleatorioCeroDiez {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.print((int)(Math.random()*11) + " ");
        }
    }
}
