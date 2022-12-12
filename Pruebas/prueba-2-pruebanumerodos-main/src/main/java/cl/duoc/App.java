package cl.duoc;

import cl.duoc.models.Carguero;
import cl.duoc.models.Pasajero;
import cl.duoc.models.Piloto;
import cl.duoc.models.VehiculoAereo;
import cl.duoc.models.Vuelo;
import cl.duoc.utils.Validaciones;
import java.time.LocalDate;

/**
 * Clase principal
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*Como Crear un usuario*/
        
        Pasajero usuario1 = new Pasajero(1
                ,"Jaime"
                ,LocalDate.of(2000, 05, 10)
                , 17767554
                ,'7'
                ,947362536
                ,"daniel@gmail.com"
                ,false);
        System.out.println(usuario1.toString());
        
        /*Validar Rut*/
        Validaciones v = new Validaciones();
        v.validaRut(usuario1.getRut(), usuario1.getDv());
        System.out.println(v.validaRut(usuario1.getRut(), usuario1.getDv()));
        /*Validar Email*/
        v.ValidarEmail(usuario1.getEmail());
        System.out.println(v.ValidarEmail(usuario1.getEmail()));
        /*Validar Telefono*/
        v.validarTelefono(usuario1.getTelefono());
        System.out.println(v.validarTelefono(usuario1.getTelefono()));
        /*Validar nombre*/
        v.validarNombre(usuario1.getNombre());
        System.out.println(v.validarNombre(usuario1.getNombre()));
        
        /*Piloto*/
        Piloto piloto1 = new Piloto();
        piloto1.setNombre("Perita");
        
        /*Agregar Vuelo*/
        Vuelo vuelo1 = new Vuelo(10, "Santiago", "Concepcion",LocalDate.of(2022,12,01),piloto1 );
        System.out.println(vuelo1.toString());
        
        System.out.println("Adios!");
    }
}