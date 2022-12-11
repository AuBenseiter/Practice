package home.myhome.arreglos;

public class CaracteresArray {

    public static void main(String[] args) {
        char[] sim = new char[9];

        sim[0] = 'a';
        sim[1] = 'x';
        sim[4] = '@';
        sim[6] = ' ';
        sim[7] = '+';
        sim[8] = 'Q';
        
        for (int i = 0; i < 9; i++) {
            System.out.println("Simbolo["+i+"]: " + "'"+sim[i]+"'");
        }
    }
}
