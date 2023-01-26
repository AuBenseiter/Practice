package cl.duoc.veterinaria.Services;

import cl.duoc.veterinaria.DTO.dtoMascota;
import java.util.ArrayList;

public interface IListMascota {
    
    public ArrayList<dtoMascota> Listar();
    
    public void GuardarCliente(dtoMascota Mascota);
    
    public String Buscar(int id);
    
    public void Eliminar(int ID);
    
    public void Eliminar(dtoMascota Mascota);
    
    public void Reemplazar(int ID, dtoMascota Mascota);
    
}
