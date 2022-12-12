package cl.duoc.models;

import java.time.LocalDate;


public class Pasaje {
    private int id;
    private Piloto piloto;
    private LocalDate fecha;
    private String codigoVuelo;
    private int valor;
    private VehiculoAereo aeronave;
    
    public Pasaje(){
        this.id = 0;
        this.piloto = new Piloto();
        this.fecha = LocalDate.now();
        this.codigoVuelo = "";
        this.valor = 0;
        this.aeronave = new VehiculoAereo();
        
    
    }

    public Pasaje(int id, Piloto piloto, LocalDate fecha, String codigoVuelo, int valor, VehiculoAereo aeronave) {
        this.id = id;
        this.piloto = piloto;
        this.fecha = fecha;
        this.codigoVuelo = codigoVuelo;
        this.valor = valor;
        this.aeronave = aeronave;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    public void setCodigoVuelo(String codigoVuelo) {
        this.codigoVuelo = codigoVuelo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public VehiculoAereo getAeronave() {
        return aeronave;
    }

    public void setAeronave(VehiculoAereo aeronave) {
        this.aeronave = aeronave;
    }
    
    
}
