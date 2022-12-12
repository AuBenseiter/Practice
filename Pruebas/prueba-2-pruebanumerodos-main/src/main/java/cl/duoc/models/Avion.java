package cl.duoc.models;

import java.time.LocalDate;

public class Avion extends VehiculoAereo {

    protected String datosExtra;

    public Avion() {
        this.datosExtra = "";
    }

    public Avion(String nombre, int id, int horasVoladas, boolean listoParaVolar, LocalDate fechaUltimoVuelo, String datosExtra) {
        super(nombre, id, horasVoladas, listoParaVolar, fechaUltimoVuelo);
        this.datosExtra = datosExtra;
    }

    public String getDatosExtra() {
        return datosExtra;
    }

    public void setDatosExtra(String datosExtra) {
        this.datosExtra = datosExtra;
    }

    @Override
    public String toString() {
        return super.toString()+ ", " + datosExtra;
    }
    
    
    

}
