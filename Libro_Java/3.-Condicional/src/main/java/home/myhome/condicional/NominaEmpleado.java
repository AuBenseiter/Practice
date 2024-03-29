package home.myhome.condicional;

import java.util.Scanner;

public class NominaEmpleado {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("1.- Programador junior");
        System.out.println("2.- Programador senior");
        System.out.println("3.- Jefe de proyecto");

        System.out.println("Introduzca el cargo del empleado (1-3): ");
        int cargo = s.nextInt();

        System.out.print("¿Cuántos días ha estado de viaje visitando clientes? ");
        int diasVisita = s.nextInt();

        System.out.println("Introduzca su estado civil (1 Soltero, 2 casado): ");
        int estadoCivil = s.nextInt();

        double sueldoBase = 0;

        switch (cargo) {
            case 1 ->
                sueldoBase = 950; //Programador junior
            case 2 ->
                sueldoBase = 1200; //Programador senior
            case 3 ->
                sueldoBase = 1600; //Jefe de Proyecto
            default ->
                System.out.println("No ha elegido correctamente el sueldo base.");
        }
        double sueldoDietas = diasVisita * 30;

        double sueldoBruto = sueldoBase + sueldoDietas;

        double irpf = 0;

        if (estadoCivil == 1) {
            irpf = 25;
        } else if (estadoCivil == 2) {
            irpf = 20;
        } else {
            System.out.println("No ha elegido correctamente el estado civil.");
        }

        double cuantiaIrpf = (sueldoBruto * irpf) / 100;

        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.printf("┃ Sueldo base            %7.2f ┃\n", sueldoBase);
        System.out.printf("┃ Dietas (%2d viajes)     %7.2f ┃\n", diasVisita, sueldoDietas);
        System.out.println("┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
        System.out.printf("┃ Sueldo bruto           %7.2f ┃\n", sueldoBruto);
        System.out.printf("┃ Retención IRPF (%.0f%%)   %7.2f ┃\n", irpf, cuantiaIrpf);
        System.out.println("┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
        System.out.printf("┃ Sueldo neto            %7.2f ┃\n", sueldoBruto - cuantiaIrpf);
        System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
    }
}
