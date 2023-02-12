package home.myhome.bucle;

import java.util.Scanner;

public class SumaNoMayorAMil {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Por favor introduzca numeros");
        System.out.println("El programa terminara cuyando la suma de los numeros sea mayor que 1000");
        
        int numeroIntroducido;
        int suma = 0;
        int numeroDeElementos = 0;
        
        do {
            numeroIntroducido = s.nextInt();
            suma += numeroIntroducido;
            numeroDeElementos++;
        } while (suma <= 1000);
        
        System.out.println("Ha introducido un total de " + numeroDeElementos + " numeros.");
        System.out.println("La suma tota es " + suma + ".");
        System.out.println("La media es " + suma / (double)numeroDeElementos);
    }
}
