package home.myhome.mavenproject3;

public class DadosPar {
    public static void main(String[] args) {
        int dado1,dado2;
        
        do {
            dado1 = (int)(Math.random() * 6) + 1;
            dado2 = (int)(Math.random() * 6) + 1;
            System.out.println(dado1 + " " + dado2);
        } while (dado1 != dado2);
    }
}
