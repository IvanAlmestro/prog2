

public class CostoIntegrador extends Costo {
    private CostoPorcentaje costo1;
    private CostoFijo costo2;
    public CostoIntegrador(Seguro seguro, CostoPorcentaje costo1, CostoFijo costo2) {
        super();
        this.costo1 = costo1;
        this.costo2 = costo2;
    }

    @Override
    public double getCosto() {
       return  costo1.getCosto() + costo2.getCosto();
    }
    
}
