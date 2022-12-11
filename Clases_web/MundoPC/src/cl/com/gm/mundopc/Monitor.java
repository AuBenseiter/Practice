package cl.com.gm.mundopc;

public class Monitor {
    private final int idMonitor;
    private String marca;
    private double tamanho;
    private static int contadorMonitores;
    
    private Monitor(){
        this.idMonitor = ++Monitor.contadorMonitores;
    }
    
    public Monitor(String marca, double tamanho){
        this();
        this.marca = marca;
        this.tamanho = tamanho;
    }
    
    public int getIdMonitor(){
        return this.idMonitor;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Monitor{");
        sb.append("idMonitor=").append(idMonitor);
        sb.append(", marca=").append(marca);
        sb.append(", tamanho=").append(tamanho);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
