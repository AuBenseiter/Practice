package cl.duoc.service.app;

import cl.duoc.models.VehiculoAereo;
import cl.duoc.service.IList;
import java.util.ArrayList;

public class ListarVehiculo implements IList {
    protected ArrayList<VehiculoAereo> listaListar;
    
    public ListarVehiculo(){
        this.listaListar = new ArrayList();
    }
    
    @Override
    public ArrayList<VehiculoAereo> Listar() {
        return listaListar;
    }

    @Override
    public String Buscar(int id) {
        return listaListar.get(id).toString();
    }

    @Override
    public void Guardar(VehiculoAereo vehiculo) {
        listaListar.add(vehiculo);
    }

    @Override
    public void Eliminar(int id) {
        listaListar.remove(id);
    }

    @Override
    public void Eliminar(VehiculoAereo vehiculo) {
        listaListar.remove(vehiculo);
    }

    @Override
    public void Reemplazar(int id, VehiculoAereo vehiculo) {
        listaListar.set(id, vehiculo);
    }
    
    
}
