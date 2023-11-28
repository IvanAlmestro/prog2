import java.time.LocalDate;

public class SeguroTemporal extends Seguro {
    private LocalDate inicio, fin;

    public SeguroTemporal(String descripcion, int nroPoliza, int dni, double montoAsegurado, Costo costo, LocalDate inicio, LocalDate fin) {
        super(descripcion, nroPoliza, dni, montoAsegurado, costo);
        this.inicio = inicio;
        this.fin = fin;
        
    }

    public LocalDate getInicio() {
        return inicio;
    }
    public LocalDate getFin() {
        return fin;
    }
    @Override
    public int getNumeroPoliza() {
        return super.getNumeroPoliza();
    }

    
    
}
