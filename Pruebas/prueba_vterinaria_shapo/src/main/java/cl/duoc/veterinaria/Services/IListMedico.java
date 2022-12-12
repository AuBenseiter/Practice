/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cl.duoc.veterinaria.Services;

import cl.duoc.veterinaria.DTO.dtoMedico;
import java.util.ArrayList;

/**
 *
 * @author cristobalguzman
 */
public interface IListMedico {
    
    public ArrayList<dtoMedico> Listar();
    
    public void GuardarCliente(dtoMedico Medico);
    
    public String Buscar(int id);
    
    public void Eliminar(int ID);
    
    public void Eliminar(dtoMedico Medico);
    
    public void Reemplazar(int ID, dtoMedico Medico);
    
    
}
