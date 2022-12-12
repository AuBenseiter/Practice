package cl.duoc.service;

import cl.duoc.models.Carguero;
import java.util.ArrayList;

public interface IListCarguero {
/*me creara una lista de vehiculo aereo que se llama listar*/
    public ArrayList<Carguero> Listar();
    
    public String Buscar(int id);
    
    public void Guardar(Carguero vehiculo);
            
    public void Eliminar(int id);
    
    public void Eliminar(Carguero vehiculo);
    
    public void Reemplazar(int id, Carguero vehiculo);   
}
