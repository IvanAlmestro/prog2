import java.time.LocalDate;
import java.util.ArrayList;

public class Pedido {
    private String material;
    private ArrayList<String> caracteristicas;
    private int costoFabricar, precioVenta;
    private LocalDate fechaEntrega;
    
    public Pedido(String material, int costoFabricar, int precioVenta,
            LocalDate fechaEntrega) {
        this.material = material;
        this.caracteristicas = new ArrayList<>();
        this.costoFabricar = costoFabricar;
        this.precioVenta = precioVenta;
        this.fechaEntrega = fechaEntrega;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public ArrayList<String> getCaracteristicas() {
        return new ArrayList<>(caracteristicas);
    }

    public void setCaracteristicas(ArrayList<String> caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    

    public int getCostoFabricar() {
        return costoFabricar;
    }

    public void setCostoFabricar(int costoFabricar) {
        this.costoFabricar = costoFabricar;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    
}
