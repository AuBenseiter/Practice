package home.myhome.condicional;

public class ecuacionesPrimerGrado {

    public static void main(String[] args) {
        System.out.println("Resolvedor de ecuaciones de primer grado (ax + b = 0)");
        System.out.println("Introduzca a: ");
        Double a = Double.parseDouble(System.console().readLine());
        
        System.out.println("Introduzca b: ");
        Double b = Double.parseDouble(System.console().readLine());
        
        if (a == 0) {
            System.out.println("Esa ecuacion no tiene solucion real");
        }else{
            System.out.println("x = " + (-b/a));
        }
        
    }
}
