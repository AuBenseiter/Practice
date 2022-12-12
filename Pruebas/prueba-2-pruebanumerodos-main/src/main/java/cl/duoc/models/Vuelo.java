package cl.duoc.models;

import java.time.LocalDate;


public class Vuelo {
    private int id;
    private String origen;
    private String destino;
    private LocalDate fecha;
    private Piloto piloto;
    
    public Vuelo(){
        this.id = 0;
        this.origen = "";
        this.destino = "";
        this.fecha = LocalDate.now();
        this.piloto = new Piloto();
    }

    public Vuelo(int id, String origen, String destino, LocalDate fecha, Piloto piloto) {
        this.id = id;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.piloto = piloto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vuelo{");
        sb.append("id=").append(id);
        sb.append(", origen=").append(origen);
        sb.append(", destino=").append(destino);
        sb.append(", fecha=").append(fecha);
        sb.append(", piloto=").append(piloto.getNombre());
        sb.append('}');
        return sb.toString();
    }
    
    
}
