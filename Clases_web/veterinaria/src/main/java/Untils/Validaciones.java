package Untils;

public class Validaciones {

    public boolean validarNombre(String nom) {
        return nom.length() > 0;
    }

    public boolean validaRut(int rut, char dv) {
        boolean validacion = false;
        try {
            int m = 0, s = 1;
            for (; rut != 0; rut /= 10) {
                s = (s + rut % 10 * (9 - m++ % 6)) % 11;
            }
            if (dv == (char) (s != 0 ? s + 47 : 75)) {
                validacion = true;
            }

        } catch (java.lang.NumberFormatException e) {
        } catch (Exception e) {
        }
        return validacion;
    }

    public boolean validarTelefono(int telefono) {
        try {
            Integer.valueOf(String.valueOf(telefono));
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    public boolean ValidarEmail(String email) {
        if (email.contains("@") && (email.endsWith(".com") || email.endsWith(".cl"))) {
            return true;
        } else {
            return false;
        }
    }
}
