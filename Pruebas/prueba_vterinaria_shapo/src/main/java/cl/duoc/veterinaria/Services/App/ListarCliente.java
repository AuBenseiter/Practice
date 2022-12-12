/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.veterinaria.Services.App;

import cl.duoc.veterinaria.DTO.dtoCliente;
import cl.duoc.veterinaria.DTO.dtoPersona;
import cl.duoc.veterinaria.Services.IListCliente;
import java.util.ArrayList;

/**
 *
 * @author Cetecom
 */
public class ListarCliente implements IListCliente{
    
    private ArrayList<dtoCliente> Lista;
    
    public ListarCliente(){
        this.Lista = new ArrayList();
    }
    
    @Override
    public ArrayList<dtoCliente> Listar() {
        return Lista;  
    }
    
    @Override
    public void GuardarCliente(dtoCliente Cliente) {
        Lista.add(Cliente);
    }

    @Override
    public String toString() {
        return "ListarCliente{" + "Lista=" + Lista + '}';
    }

    @Override
    public String Buscar(int id) {
         return Lista.get(id).toString();
    }

    @Override
    public void Eliminar(int id) {
        Lista.remove(id);
    }

    @Override
    public void Eliminar(dtoCliente Cliente) {
        Lista.remove(Cliente);
    }

    @Override
    public void Reemplazar(int id, dtoCliente Cliente) {
        Lista.set(id, Cliente);
    }
    
    
  
}
