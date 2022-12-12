package cl.duoc.service;

import cl.duoc.models.Avioneta;
import java.util.ArrayList;

public interface IListAvioneta {
    /*me creara una lista de vehiculo aereo que se llama listar*/
    public ArrayList<Avioneta> Listar();
    
    public String Buscar(int id);
    
    public void Guardar(Avioneta vehiculo);
            
    public void Eliminar(int id);
    
    public void Eliminar(Avioneta vehiculo);
    
    public void Reemplazar(int id, Avioneta vehiculo);
}
