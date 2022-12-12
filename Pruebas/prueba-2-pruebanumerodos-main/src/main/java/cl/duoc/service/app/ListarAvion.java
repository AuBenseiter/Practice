package cl.duoc.service.app;

import cl.duoc.models.Avion;
import cl.duoc.service.IListAvion;
import java.util.ArrayList;

public class ListarAvion implements IListAvion{
    private final ArrayList<Avion> listaAvion;
    
    public ListarAvion(){
        this.listaAvion = new ArrayList();
    }
    
    @Override
    public ArrayList<Avion> Listar(){
        return listaAvion;
    }

    @Override
    public String Buscar(int id) {
        return listaAvion.get(id).toString();
    }

    @Override
    public void Guardar(Avion avion) {
        listaAvion.add(avion);
    }

    @Override
    public void Eliminar(int id) {
        listaAvion.remove(id);
    }

    @Override
    public void Eliminar(Avion avion) {
        listaAvion.remove(avion);
    }

    @Override
    public void Reemplazar(int id, Avion avion) {
        listaAvion.set(id, avion);
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(Avion avion : this.listaAvion){
            sb.append(avion);
        }
        return sb.toString();
    }
    
    
}
