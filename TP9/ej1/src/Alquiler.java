import java.time.LocalDate;

public class Alquiler {
    private int id_cancha;
    private LocalDate fecha;
    private double costo;
    
    public Alquiler(int id_cancha, LocalDate fecha, double costo) {
        this.id_cancha = id_cancha;
        this.fecha = fecha;
        this.costo = costo;
    }

    public int getId_cancha() {
        return id_cancha;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    
}
