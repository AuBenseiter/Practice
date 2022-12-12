/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.veterinaria.DTO;

/**
 *
 * @author Cetecom
 */
public class dtoMedico extends dtoPersona{
    
    protected String especialidad;

    public dtoMedico(String especialidad, int rut, String dv, String nombre, String correo, String direccion, String comuna) {
        super(rut, dv, nombre, correo, direccion, comuna);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "dtoMedico{" + super.toString() +  "especialidad=" + especialidad + '}';
    }
    
    
    
}
