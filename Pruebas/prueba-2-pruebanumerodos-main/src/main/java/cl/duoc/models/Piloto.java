package cl.duoc.models;

public class Piloto {
    private int id;
    private String nombre;
    private VehiculoAereo aeronave;
    
    public Piloto(){
        this.id = 0;
        this.nombre = "";
        this.aeronave = new VehiculoAereo();
    }

    public Piloto(int id, String nombre, VehiculoAereo aeronave) {
        this.id = id;
        this.nombre = nombre;
        this.aeronave = aeronave;
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

    public VehiculoAereo getAeronave() {
        return aeronave;
    }

    public void setAeronave(VehiculoAereo aeronave) {
        this.aeronave = aeronave;
    }
    
    
}
