import java.time.LocalDate;

public class Alquiler {
    private LocalDate fechaExpiracion;
    private Item itemAlquilado;
    private LocalDate fechaAlquiler;

    public Alquiler(Item itemAlquilado, LocalDate fechaExpiracion){
        this.fechaAlquiler = LocalDate.now();
        this.fechaExpiracion = fechaExpiracion;
        this.itemAlquilado = itemAlquilado;
    }

    public LocalDate getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(LocalDate fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public Item getItemAlquilado() {
        return itemAlquilado;
    }

    public void setItemAlquilado(Item itemAlquilado) {
        this.itemAlquilado = itemAlquilado;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }
    
    
}
