package home.myhome.condicional;

public class Condicional {

    public static void main(String[] args) {
        String dia;
        System.out.println("Introduzca un dia de la semana y dire \n la primera asignatura del dia");
        dia = System.console().readLine();
        dia = dia.toLowerCase();

        switch (dia) {
            case "lunes":
            case "martes":
            case "miercoles":
                System.out.println("Programacion");
                break;
            case "jueves":
                System.out.println("Sistemas Informaticos");
                break;
            case "viernes":
                System.out.println("Base de Datos");
                break;
            case "sabado":
            case "domingo":
                System.out.println("No hay clase");
            default:
                System.out.println("El dia introducido no es correcto");

        }
    }
}
