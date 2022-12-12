package cl.duoc.models;

import java.time.LocalDate;

public class Carguero extends VehiculoAereo {
    protected int tonelaje;
    
    public Carguero(){
        this.tonelaje = 0;
    }
    
    public Carguero( String nombre,int id, int horasVoladas, boolean listoParaVolar, LocalDate fechaUltimoVuelo, int tonelaje){
        super(nombre,id,horasVoladas,listoParaVolar,fechaUltimoVuelo);
        this.tonelaje = tonelaje;
    }

    public int getTonelaje() {
        return tonelaje;
    }

    public void setTonelaje(int tonelaje) {
        this.tonelaje = tonelaje;
    }

    @Override
    public String toString() {
        return super.toString()+ ", " + tonelaje;
    }
    
    

}
