package DTO;

import Untils.Validaciones;
import java.time.LocalDate;

public class Cuidador {
    private int id;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private String rut;
    private int telefono;
    private boolean casado;

    public Cuidador(int id, String nombre, String apellido, LocalDate fechaNacimiento, String tur, int telefono, boolean casado) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.rut = tur;
        this.telefono = telefono;
        this.casado = casado;
    }
    
    public Cuidador() {
        this.id = 0;
        this.nombre = "";
        this.apellido = "";
        this.fechaNacimiento = LocalDate.now();
        this.rut = "";
        this.telefono = 0;
        this.casado = false;
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
        if (Validaciones.largoMinimoPalabra(3, nombre)) {
            this.nombre = nombre;
        }
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    @Override
    public String toString() {
        return "";
    }
    
    
    
    
}
