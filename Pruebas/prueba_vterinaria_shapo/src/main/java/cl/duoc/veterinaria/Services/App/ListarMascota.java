
package cl.duoc.veterinaria.Services.App;

import cl.duoc.veterinaria.DTO.dtoMascota;
import cl.duoc.veterinaria.Services.IListMascota;
import java.util.ArrayList;

public class ListarMascota implements IListMascota{

    private ArrayList<dtoMascota> Lista;
    
    public ListarMascota(){
        this.Lista = new ArrayList();
    }
    
    @Override
    public ArrayList<dtoMascota> Listar() {
        return Lista;  
    }
    
    @Override
    public void GuardarCliente(dtoMascota Mascota) {
        Lista.add(Mascota);
    }

    @Override
    public String toString() {
        return "ListarMascota{" + "Lista=" + Lista + '}';
    }

    @Override
    public String Buscar(int id) {
         return Lista.get(id).toString();
    }

    @Override
    public void Eliminar(int ID) {
    }

    @Override
    public void Eliminar(dtoMascota Mascota) {
    }

    @Override
    public void Reemplazar(int ID, dtoMascota Mascota) {
    }
    
}
