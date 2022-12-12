package cl.duoc.service.app;

import cl.duoc.models.Carguero;
import cl.duoc.service.IListCarguero;
import java.util.ArrayList;

public class ListarCarguero implements IListCarguero{
    private final ArrayList<Carguero> listaCarguero;
    
    public ListarCarguero(){
        this.listaCarguero = new ArrayList();
    }
    
    @Override
    public ArrayList<Carguero> Listar(){
        return listaCarguero;
    }

    @Override
    public String Buscar(int id) {
        return listaCarguero.get(id).toString();
    }

    @Override
    public void Guardar(Carguero carguero) {
        listaCarguero.add(carguero);
    }

    @Override
    public void Eliminar(int id) {
        listaCarguero.remove(id);
    }

    @Override
    public void Eliminar(Carguero carguero) {
        listaCarguero.remove(carguero);
    }

    @Override
    public void Reemplazar(int id, Carguero carguero) {
        listaCarguero.set(id, carguero);
    }
}
