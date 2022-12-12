package cl.duoc.models;

import java.time.LocalDate;

public class Avioneta extends VehiculoAereo {
    protected Boolean ultraSonido;
    
    public Avioneta(){
        this.ultraSonido = false;
    }
    
    public Avioneta( String nombre,int id, int horasVoladas, boolean listoParaVolar, LocalDate fechaUltimoVuelo, Boolean ultraSonido){
        super(nombre,id,horasVoladas,listoParaVolar,fechaUltimoVuelo);
        this.ultraSonido = ultraSonido;
    }

    public Boolean getUltraSonido() {
        return ultraSonido;
    }

    public void setUltraSonido(Boolean ultraSonido) {
        this.ultraSonido = ultraSonido;
    }

    @Override
    public String toString() {
        return super.toString()+ ", " + ultraSonido;
    }
    
    
    
}
