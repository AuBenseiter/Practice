package DTO;

public abstract class Animal {
    private int id;
    private String nombre;
    private String raza;
    private String patron;
    private int edad;
    private boolean vegetariano;

    public Animal(int id, String nombre, String raza, String patron, int edad, boolean vegetariano) {
        this.id = id;
        this.nombre = nombre;
        this.raza = raza;
        this.patron = patron;
        this.edad = edad;
        this.vegetariano = false;
    }
    
    public Animal() {
        this.id = 0;
        this.nombre = "";
        this.raza = "";
        this.patron = "";
        this.edad = 0;
        this.vegetariano = vegetariano;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getPatron() {
        return patron;
    }

    public void setPatron(String patron) {
        this.patron = patron;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isVegetariano() {
        return vegetariano;
    }

    public void setVegetariano(boolean vegetariano) {
        this.vegetariano = vegetariano;
    }
    
    @Override 
    public abstract String toString();
}
