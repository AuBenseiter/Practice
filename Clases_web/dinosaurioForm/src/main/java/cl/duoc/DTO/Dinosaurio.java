package cl.duoc.DTO;

public class Dinosaurio {
    String nombre;
    String raza;
    Boolean tieneCola;
    
    public Dinosaurio(){
        
    }
    public Dinosaurio(String nombre, String raza, Boolean tieneCola) {
        this.nombre = nombre;
        this.raza = raza;
        this.tieneCola = tieneCola;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Boolean isTieneCola() {
        return tieneCola;
    }

    public void setTieneCola(Boolean tieneCOla) {
        this.tieneCola = tieneCOla;
    }
    
    
    
    @Override
    public String toString(){
        return this.nombre + " " +
                this.raza + " " +
                (this.isTieneCola() ? "Si tiene cola" : "No tiene colas");
    }
}
