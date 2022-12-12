package cl.duoc.service;

import cl.duoc.models.VehiculoAereo;
import java.util.ArrayList;

public interface IList {
    
    /*me creara una lista de vehiculo aereo que se llama listar*/
    public ArrayList<VehiculoAereo> Listar();
    
    public String Buscar(int id);
    
    public void Guardar(VehiculoAereo vehiculo);
            
    public void Eliminar(int id);
    
    public void Eliminar(VehiculoAereo vehiculo);
    
    public void Reemplazar(int id, VehiculoAereo vehiculo);
}
