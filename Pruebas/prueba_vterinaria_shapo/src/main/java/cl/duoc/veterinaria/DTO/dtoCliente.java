/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.veterinaria.DTO;

/**
 *
 * @author Cetecom
 */
public class dtoCliente extends dtoPersona {
    
    protected boolean empresa;

    public dtoCliente(boolean empresa, int rut, String dv, String nombre, String correo, String direccion, String comuna) {
        super(rut, dv, nombre, correo, direccion, comuna);
        this.empresa = empresa;
    }

    public boolean isEmpresa() {
        return empresa;
    }
    
    public String getEmpresa(){
        if(empresa){
            return "Si";
        }else{
            return "No";
        }
    }

    public void setEmpresa(boolean empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "Cliente" +
                super.toString() + 
                "\nempresa= " + empresa;
    }
    
    
}
