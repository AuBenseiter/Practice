package home.myhome.mavenproject3;

public class PantallMatrix {
    public static void main(String[] args) throws InterruptedException {
        int linea = 0;
        
        System.out.print("\003[32m");
        
        for (int i = 0; i < 8000; i++) {
            System.out.print((char)(Math.random() * (126 - 32 + 1) + 32));
            
            if (linea++ == 60) {
                linea = 0;
                Thread.sleep(50);
                System.out.println();
            }
        }
    }
}
