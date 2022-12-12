/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.veterinaria.DTO;

/**
 *
 * @author Cetecom
 */
public class dtoMascota {
    
    protected dtoCliente dueno;
    protected int microchip;
    protected String nombremascota;
    protected String fechanac;
    protected String especie;
    protected String raza;
    protected String descripcion;

    public dtoMascota(dtoCliente dueno, int microchip, String nombremascota, String fechanac, String especie, String raza, String descripcion) {
        this.dueno = dueno;
        this.microchip = microchip;
        this.nombremascota = nombremascota;
        this.fechanac = fechanac;
        this.especie = especie;
        this.raza = raza;
        this.descripcion = descripcion;
    }

    public dtoCliente getDueno() {
        return dueno;
    }

    public void setDueno(dtoCliente dueno) {
        this.dueno = dueno;
    }
    
    



    public int getMicrochip() {
        return microchip;
    }

    public void setMicrochip(int microchip) {
        this.microchip = microchip;
    }

    public String getNombremascota() {
        return nombremascota;
    }

    public void setNombremascota(String nombremascota) {
        this.nombremascota = nombremascota;
    }

    public String getFechanac() {
        return fechanac;
    }

    public void setFechanac(String fechanac) {
        this.fechanac = fechanac;
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
        return "dtoMascota{" + "dueno=" + dueno.toString() + ", microchip=" + microchip + ", nombremascota=" + nombremascota + ", fechanac=" + fechanac + ", especie=" + especie + ", raza=" + raza + ", descripcion=" + descripcion + '}';
    }


    
    
    
}
