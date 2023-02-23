package home.myhome.mavenproject3;

public class DadoDePoker {
    public static void main(String[] args) {
        String dado = "";
        for (int i = 0; i < 5; i++) {
            switch((int)(Math.random()*6)){
                case 0 -> {dado = "AS";}
                case 1 -> {dado = "K";}
                case 2 -> {dado = "Q";}
                case 3 -> {dado = "J";}
                case 4 -> {dado = "7";}
                case 5 -> {dado = "8";}
                default -> {}
            }
            System.out.print( dado +" ");
        }
    }
}
