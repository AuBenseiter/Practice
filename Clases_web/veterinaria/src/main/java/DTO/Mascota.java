package DTO;

import java.time.LocalDate;



public class Mascota {
    private int microchip;
    private String nombre;
    private String dueño;
    private LocalDate fechaNacimiento;
    private String especie;
    private String raza;
    private String descripcion;

    public Mascota(int microchip, String nombre, String dueño, LocalDate fechaNacimiento, String especie, String raza, String descripcion) {
        this.microchip = microchip;
        this.nombre = nombre;
        this.dueño = dueño;
        this.fechaNacimiento = fechaNacimiento;
        this.especie = especie;
        this.raza = raza;
        this.descripcion = descripcion;
    }
    
    public Mascota() {
        this.microchip = 0;
        this.nombre = "";
        this.dueño = "";
        this.fechaNacimiento = LocalDate.now();
        this.especie = "";
        this.raza = "";
        this.descripcion = "";
    }

    public int getMicrochip() {
        return microchip;
    }

    public void setMicrochip(int microchip) {
        this.microchip = microchip;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Mascota{" + "microchip=" + microchip 
                + ", nombre=" + nombre 
                + ", due\u00f1o=" + dueño 
                + ", fechaNacimiento=" + fechaNacimiento 
                + ", especie=" + especie 
                + ", raza=" + raza 
                + ", descripcion=" + descripcion + '}';
    }

    
    
    
}
