package DTO;

import Untils.Validaciones;

public abstract class Persona {

    private int id;
    private String nombre;
    private int rut;
    private char dv;
    private String direccion;
    private String email;

    Validaciones valida = new Validaciones();

    public Persona(int id, String nombre, int rut, char dv, String direccion, String email) {
        this.id = id;
        this.nombre = nombre;
        this.rut = rut;
        this.dv = dv;
        this.direccion = direccion;
        this.email = email;
    }

    public Persona() {
        this.id = 0;
        this.nombre = "";
        this.rut = 0;
        this.dv = 0;
        this.direccion = "";
        this.email = "";
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

    public int getRut() {
        return rut;
    }

    public void setRut(int rut, char dv) {
        if (valida.validaRut(rut, dv)) {
            this.rut = rut;
            this.dv = dv;
        }

    }

    public char getDv() {
        return dv;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (valida.ValidarEmail(email)) {
            this.email = email;
        } else {
            this.email = "No Cumple requisitos";
        }

    }

    @Override
    public abstract String toString();

}
