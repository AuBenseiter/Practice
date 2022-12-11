package DTO;

public class Medico extends Persona {
    
    private String especialidad;

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Medico{" + "especialidad=" + especialidad + '}';
    }
    
    
    
}
