package accesodatos;

public interface IAccesoDatos {
    //TODO: atributo de interface
    int MAX_REGISTRO = 10;
    
    
    //TODO: Metodos abstractos
    /*EN AUTOMATICO EL COMPILADOR AGREGA ABSTRAC*/
    
    void insertar();
    
    void listar();
    
    void actualizar();
    
    void eliminar();
}
