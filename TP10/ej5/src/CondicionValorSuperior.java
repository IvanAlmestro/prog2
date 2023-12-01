public class CondicionValorSuperior extends Condicion {
    private int valorMaximo;
    
    public CondicionValorSuperior(int valorMaximo) {
        this.valorMaximo = valorMaximo;
    }

    @Override
    public boolean cumple(PaqueteAbstracto pa) {
        return pa.getValorAsegurado() <  valorMaximo;
    }

    public int getValorMamimo() {
        return valorMaximo;
    }

    public void setValorMamimo(int valorMaximo) {
        this.valorMaximo = valorMaximo;
    }
    
}
