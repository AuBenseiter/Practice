package cl.duoc.models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class VehiculoAereo {
    //TODO: atributos repetidos
    protected int id;
    private static int correlativo = 10;
    protected String nombre;
    protected int horasVoladas;
    protected Boolean listoParaVolar;
    protected LocalDate fechaUltimoVuelo;
    
    public VehiculoAereo(){
        this.nombre = "";
        this.horasVoladas = 0;
        this.listoParaVolar = false;
        this.fechaUltimoVuelo = LocalDate.now();
    }

    public VehiculoAereo(String nombre,int id,  int horasVoladas, Boolean listoParaVolar, LocalDate fechaUltimoVuelo) {
        this.nombre = nombre;
        this.id = (correlativo++)*10;
        this.horasVoladas = horasVoladas;
        this.listoParaVolar = listoParaVolar;
        this.fechaUltimoVuelo = fechaUltimoVuelo;
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

    public int getHorasVoladas() {
        return horasVoladas;
    }

    public void setHorasVoladas(int horasVoladas) {
        this.horasVoladas = horasVoladas;
    }

    public Boolean getListoParaVolar() {
        return listoParaVolar;
    }

    public void setListoParaVolar(Boolean listoParaVolar) {
        this.listoParaVolar = listoParaVolar;
    }

    public LocalDate getFechaUltimoVuelo() {
        return fechaUltimoVuelo;
    }

    public void setFechaUltimoVuelo(LocalDate fechaUltimoVuelo) {
        this.fechaUltimoVuelo = fechaUltimoVuelo;
    }
    
    
    
    @Override
    public String toString() {
        return nombre + ", " + "#"+getId() + ", "+ "ultimo vuelo: " + getFechaUltimoVuelo().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ", " + "total de horas: " + horasVoladas;
    }

    
    
    
    
}
