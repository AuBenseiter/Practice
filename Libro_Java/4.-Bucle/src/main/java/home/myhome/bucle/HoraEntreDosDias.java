package home.myhome.bucle;

import java.util.Scanner;

public class HoraEntreDosDias {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int primerDia = 0;
        int segundoDia = 0;
        int primeraHora = 0;
        int segundaHora = 0;
        String primerDiaString;
        String segundoDiaString;
        String nombrePrimerDia = "";
        String nombreSegundoDia = "";
        boolean datosCorrectos = true;
        do {
            System.out.println("Introduzca la primera hora ");
            boolean diaCorrecto;

            //primer dia//
            do {
                diaCorrecto = true;
                System.out.print("Dia: ");
                primerDiaString = s.next().toLowerCase();

                switch (primerDiaString) {
                    case "lunes" -> {
                    }
                    case "1" -> {
                        primerDia = 1;
                        nombrePrimerDia = "lunes";
                    }

                    case "martes" -> {
                    }
                    case "2" -> {
                        primerDia = 2;
                        nombrePrimerDia = "martes";
                    }

                    case "miercoles" -> {
                    }
                    case "3" -> {
                        primerDia = 3;
                        nombrePrimerDia = "miercoles";
                    }

                    case "jueves" -> {
                    }
                    case "4" -> {
                        primerDia = 1;
                        nombrePrimerDia = "jueves";
                    }

                    case "viernes" -> {
                    }
                    case "5" -> {
                        primerDia = 5;
                        nombrePrimerDia = "viernes";
                    }

                    case "sabado" -> {
                    }
                    case "6" -> {
                        primerDia = 6;
                        nombrePrimerDia = "sabado";
                    }

                    case "domingo" -> {
                    }
                    case "7" -> {
                        primerDia = 7;
                        nombrePrimerDia = "domingo";
                    }

                    default -> {
                        diaCorrecto = false;
                    }
                }
                if (!diaCorrecto) {
                    System.out.println("No se ha introducido correctaente el dia de la semana ");
                    System.out.println("Los dias validos son de lunes a domingo");
                }
            } while (!diaCorrecto);
            //Primera hora//
            boolean horaCorrecta;

            do {
                horaCorrecta = true;
                System.out.print("Hora: ");
                primeraHora = s.nextInt();
                if ((primeraHora < 0) || (primeraHora > 23)) {
                    System.out.println("No se ha introducido correctamente la hora del dia");
                    System.out.println("Las horas van desde 0 a 23");
                    horaCorrecta = false;
                }
            } while (!horaCorrecta);
            System.out.println("Por favor introduzca la segunda hora");

            //Segundo dia//
            do {
                datosCorrectos = true;
                diaCorrecto = true;
                System.out.print("Dia: ");
                segundoDiaString = s.next().toLowerCase();

                switch (segundoDiaString) {
                    case "lunes":
                    case "1":
                        segundoDia = 1;
                        nombreSegundoDia = "lunes";
                        break;
                    case "martes":
                    case "2":
                        segundoDia = 2;
                        nombreSegundoDia = "martes";
                        break;
                    case "miércoles":
                    case "3":
                        segundoDia = 3;
                        nombreSegundoDia = "miércoles";
                        break;
                    case "jueves":
                    case "4":
                        segundoDia = 4;
                        nombreSegundoDia = "jueves";
                        break;
                    case "viernes":
                    case "5":
                        segundoDia = 5;
                        nombreSegundoDia = "viernes";
                        break;
                    case "sábado":
                    case "6":
                        segundoDia = 6;
                        nombreSegundoDia = "sábado";
                        break;
                    case "domingo":
                    case "7":
                        segundoDia = 7;
                        nombreSegundoDia = "domingo";
                        break;
                    default:
                        segundoDia = 0;
                }
                if (!diaCorrecto) {
                    System.out.println("No se ha introducido correctamente el dia de la semana");
                    System.out.println("Los dias validos son de luneas a domingo");
                }

            } while (!diaCorrecto);

            //Comprueba que el segundo dia sea posteriao al primero//
            if (segundoDia <= primerDia) {
                System.out.println("El segundo dia debe ser posterior al primero.");
                datosCorrectos = false;
            }

            //Segunda hora//
            if (datosCorrectos) {
                do {
                    horaCorrecta = true;
                    System.out.print("Hora: ");
                    segundaHora = s.nextInt();
                    if ((segundaHora < 0) || (segundaHora > 23)) {
                        System.out.println("No se ha introducido correctamente la hora del día.");
                        System.out.println("Las horas válidas están entre 0 y 23.");
                        horaCorrecta = false;
                    }
                } while (!horaCorrecta);
            }
        } while (!datosCorrectos);

        //Fin de la recogida de datos//
        System.out.print("Entre las " + primeraHora + ":00 h del " + nombrePrimerDia);
        System.out.print(" y las " + segundaHora + ":00 h del " + nombreSegundoDia);
        System.out.println(" hay " + (((segundoDia * 24) + segundaHora) - ((primerDia * 24) + primeraHora)) + " hora/s");
    }
}
