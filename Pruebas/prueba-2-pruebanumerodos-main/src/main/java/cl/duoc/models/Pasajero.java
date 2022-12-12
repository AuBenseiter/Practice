package cl.duoc.models;

import java.time.LocalDate;
import cl.duoc.utils.Validaciones;

public class Pasajero {
    private int Id;
    private String nombre;
    private LocalDate fechaNacimiento;
    private int rut;
    private char dv;
    private int telefono;
    private String email;
    private boolean vetado;
    
    Validaciones valida = new Validaciones();
    
    public Pasajero(){
        this.Id = 0;
        this.nombre = "";
        this.fechaNacimiento= LocalDate.now();
        this.rut = 0;
        this.dv = 0;
        this.telefono = 0;
        this.vetado = false;
    }

    public Pasajero(int Id, String nombre, LocalDate fechaNacimiento, int rut, char dv, int telefono, String email, boolean vetado) {
        this.Id = Id;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.rut = rut;
        this.dv = dv;
        this.telefono = telefono;
        this.email = email;
        this.vetado = vetado;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(valida.validarNombre(nombre)){
            this.nombre = nombre;
        }
        else{
            this.nombre = "sin registrar";
        }
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut,char dv) {
        if (valida.validaRut(rut, dv)){
            this.rut = rut;
            this.dv = dv;
        }
    }

    public char getDv() {
        return this.dv;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        if(valida.validarTelefono(telefono)){
           this.telefono = telefono; 
        }
        else{
            this.telefono = 0;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (valida.ValidarEmail(email)){
            this.email = email;
        }
        else{
            this.email = "No cumple requisitos";
        }
    }

    public boolean isVetado() {
        return vetado;
    }

    public void setVetado(boolean vetado) {
        this.vetado = vetado;
    }

    @Override
    public String toString() {
        return "Pasajero{"
                + "\nID: "+this.Id
                + "\nNombre: "+this.nombre
                + "\nFecha Nacimiento: "+this.fechaNacimiento
                + "\nRut: " + this.rut + " -" + this.dv
                + "\nTelefono: " + this.telefono
                + "\n Email: " + this.email
                + "\nVetado" + this.vetado;
    }

    
    
    
}
