/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cl.duoc.veterinaria.Services;

import cl.duoc.veterinaria.DTO.dtoCliente;
import java.util.ArrayList;

/**
 *
 * @author Cetecom
 */
public interface IListCliente {
    
    public ArrayList<dtoCliente> Listar();
    public void GuardarCliente(dtoCliente Cliente);
    
    
    public String Buscar(int id);
    
    
    public void Eliminar(int ID);
    
    public void Eliminar(dtoCliente Cliente);
    
    public void Reemplazar(int ID, dtoCliente Cliente);
}
