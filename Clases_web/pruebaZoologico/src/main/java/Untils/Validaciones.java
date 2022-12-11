package Untils;

import java.time.LocalDate;
import java.time.Period;

public class Validaciones {

    public static boolean validarMayorEdad(LocalDate fecha) {
        Period p = Period.between(fecha, LocalDate.now());
        return (p.getYears() >= 18);

    }
    
    public static boolean largoMinimoPalabra(int largo, String palabra){
        return palabra.length() > largo;
    }
    
    public static boolean validarPalabra(String palabra){
        return !palabra.isEmpty() && palabra.length() > 3;
    }
}
