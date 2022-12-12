package cl.duoc.service.app;

import cl.duoc.models.Avioneta;
import cl.duoc.service.IListAvioneta;
import java.util.ArrayList;

public class ListarAvioneta implements IListAvioneta{
    private final ArrayList<Avioneta> listaAvioneta;
    
    public ListarAvioneta(){
        this.listaAvioneta = new ArrayList();
    }
    
    @Override
    public ArrayList<Avioneta> Listar(){
        return listaAvioneta;
    }

    @Override
    public String Buscar(int id) {
        return listaAvioneta.get(id).toString();
    }

    @Override
    public void Guardar(Avioneta avioneta) {
        listaAvioneta.add(avioneta);
    }

    @Override
    public void Eliminar(int id) {
        listaAvioneta.remove(id);
    }

    @Override
    public void Eliminar(Avioneta avioneta) {
        listaAvioneta.remove(avioneta);
    }

    @Override
    public void Reemplazar(int id, Avioneta avioneta) {
        listaAvioneta.set(id, avioneta);
    }
}    
    //TODO: TO STRING

