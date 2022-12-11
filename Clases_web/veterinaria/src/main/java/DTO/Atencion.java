package DTO;

import java.time.LocalDate;

public class Atencion {
    private LocalDate fechaAtencion;
    private Medico medico;
    private Mascota mascota;
    private String procedimientoRealizado;
    private String observaciones;
    private int valor;

    public Atencion(LocalDate fechaAtencion, Medico medico, Mascota mascota, String procedimientoRealizado, String observaciones, int valor) {
        this.fechaAtencion = fechaAtencion;
        this.medico = medico;
        this.mascota = mascota;
        this.procedimientoRealizado = procedimientoRealizado;
        this.observaciones = observaciones;
        this.valor = valor;
    }
    
    public Atencion() {
        this.fechaAtencion = LocalDate.now();
        this.medico = new Medico();
        this.mascota = new Mascota();
        this.procedimientoRealizado = "";
        this.observaciones = "";
        this.valor = 0;
    }

    public LocalDate getFechaAtencion() {
        return fechaAtencion;
    }

    public void setFechaAtencion(LocalDate fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public String getProcedimientoRealizado() {
        return procedimientoRealizado;
    }

    public void setProcedimientoRealizado(String procedimientoRealizado) {
        this.procedimientoRealizado = procedimientoRealizado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Atencion{" + "fechaAtencion=" + fechaAtencion 
                + ", medico=" + medico 
                + ", mascota=" + mascota 
                + ", procedimientoRealizado=" + procedimientoRealizado 
                + ", observaciones=" + observaciones 
                + ", valor=" + valor + '}';
    }
    
    
    
    
}
