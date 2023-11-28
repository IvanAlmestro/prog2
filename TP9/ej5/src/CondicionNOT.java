public class CondicionNOT extends Condicion {
    private Condicion c1;
    
    public CondicionNOT(Condicion c1) {
        this.c1 = c1;
    }

    @Override
    public boolean cumple(Seguro seguro) {
        return !c1.cumple(seguro);
    }
    
}
