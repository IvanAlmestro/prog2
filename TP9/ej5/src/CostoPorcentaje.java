public class CostoPorcentaje  extends Costo{
    private double valorAsegurado;
    private double porcentaje;

    
    public CostoPorcentaje(Seguro seguro, double valorAsegurado, double porcentaje) {
        super(seguro);
        this.valorAsegurado = valorAsegurado;
        
        this.porcentaje = porcentaje;
    }


    @Override
    public double getCosto() {

        return (this.valorAsegurado*this.porcentaje)/100;
    }
    
}
