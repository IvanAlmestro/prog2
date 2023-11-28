public class CondicionXMontoAsegurado extends Condicion{
    private int montoPropuesto;

    
    public CondicionXMontoAsegurado(int montoPropuesto) {
        this.montoPropuesto = montoPropuesto;
    }


    @Override
    public boolean cumple(Seguro seguro) {
        return seguro.getMonto() > montoPropuesto;
    }
    
}
