import java.util.ArrayList;

public abstract class PaqueteAbstracto {
    private int id, costoEnvio, valorAsegurado;
    private String destino;
    
    public PaqueteAbstracto(int id, int costoEnvio, int valorAsegurado, String destino) {
        this.id = id;
        this.costoEnvio = costoEnvio;
        this.valorAsegurado = valorAsegurado;
        this.destino = destino;
    }

    public abstract int getPrecio();
    public abstract int getValorAsegurado();
    public abstract int getCantPaquete();
    public abstract Paquete getMayorValorAsegurado();
    public abstract PaqueteAbstracto getCopia(); //devuelve un paquete o un combo no una lista
    public abstract ArrayList<PaqueteAbstracto> buscar();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCostoEnvio() {
        return costoEnvio;
    }

    public void setCostoEnvio(int costoEnvio) {
        this.costoEnvio = costoEnvio;
    }

    public void setValorAsegurado(int valorAsegurado) {
        this.valorAsegurado = valorAsegurado;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    
}
