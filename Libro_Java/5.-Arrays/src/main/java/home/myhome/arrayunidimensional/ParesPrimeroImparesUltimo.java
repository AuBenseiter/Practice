package home.myhome.arrayunidimensional;

public class ParesPrimeroImparesUltimo {
    public static void main(String[] args) {
        int[] n = new int[20];
        int[] par = new int[20];
        int[] impar = new int[20];
        int pares = 0;
        int impares = 0;
        
        for (int i = 0; i < 20; i++) {
            n[i] = (int)(Math.random()*101);
            if (n[i] % 2 == 0) {
                par[pares++] = n[i];
            }else{
                impar[impares++] = n[i];
            }
        }
        
        System.out.println("Array original");
        for (int i = 0; i < 20; i++) {
            System.out.print(n[i] + " ");
        }
        System.out.println();
        
        //Pares Primera posicion
        for (int i = 0; i < pares; i++) {
            n[i] = par[i];
        }
        //Impares en los huecos que quedan
        for (int i = pares; i < 20; i++) {
            n[i] = impar[i-pares];
        }
        //muestra el resultado
        System.out.println("Array Con Pares Al Principio");
        for (int i = 0; i < 20; i++) {
            System.out.print(n[i] + " ");
        }
    }
}
