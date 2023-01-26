/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.veterinaria.DTO;

/**
 *
 * @author Cetecom
 */
public abstract class dtoPersona {
    
    protected static int contador_id = 0;
    protected int id;
    protected int rut;
    protected String dv;
    protected String nombre;
    protected String correo;
    protected String direccion;
    protected String comuna;
    

    public dtoPersona(int rut, String dv, String nombre, String correo, String direccion, String comuna) {
        this.id = contador_id++;
        this.rut = rut;
        this.dv = dv;
        this.nombre = nombre;
        this.correo = correo;
        this.direccion = direccion;
        this.comuna = comuna;
    }

    public dtoPersona() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getDv() {
        return dv;
    }

    public void setDv(String dv) {
        this.dv = dv;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public static int getContador_id() {
        return contador_id;
    }

    public static void setContador_id(int contador_id) {
        dtoPersona.contador_id = contador_id;
    }
    
    @Override
    public String toString() {
        return  "\nid= " + id +
                "\nrut= " + rut +"-" + dv +
                "\nnombre= " + nombre +
                "\ncorreo= " + correo +
                "\ndireccion= " + direccion +
                "\ncomuna=" +comuna;
    }
}
