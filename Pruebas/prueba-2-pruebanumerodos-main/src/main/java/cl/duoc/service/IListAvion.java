package cl.duoc.service;

import cl.duoc.models.Avion;
import java.util.ArrayList;

public interface IListAvion {
    
    /*me creara una lista de vehiculo aereo que se llama listar*/
    public ArrayList<Avion> Listar();
    
    public String Buscar(int id);
    
    public void Guardar(Avion avion);
            
    public void Eliminar(int id);
    
    public void Eliminar(Avion avion);
    
    public void Reemplazar(int id, Avion avion);
}

