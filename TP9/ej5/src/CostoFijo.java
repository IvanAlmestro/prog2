public class CostoFijo extends Costo {

    private double monto;
    
    public CostoFijo(double monto, Seguro seguro) {
        super();
        this.monto = monto;
    }

    @Override
    public double getCosto() {
        return this.monto;
    }
    
}
