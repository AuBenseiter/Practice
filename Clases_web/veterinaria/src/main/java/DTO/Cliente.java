package DTO;

public class Cliente extends Persona{
    private String comuna;
    private int telefono;
    private boolean particular;

    public Cliente(String comuna, int telefono, boolean particular) {
        this.comuna = comuna;
        this.telefono = telefono;
        this.particular = particular;
        
    }
    
    public Cliente() {
        this.comuna = "";
        this.telefono = 0;
        this.particular = false;
    }

    public boolean isParticular() {
        return particular;
    }

    public void setParticular(boolean particular) {
        this.particular = particular;
    }
    
    
    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        if (valida.validarTelefono(telefono)) {
            this.telefono = telefono;
        }
        
    }

    @Override
    public String toString() {
        return "Cliente{" + "comuna=" + comuna 
                + ", telefono=" + telefono 
                + ", particular=" + particular + '}';
    }
    
    
    
}
