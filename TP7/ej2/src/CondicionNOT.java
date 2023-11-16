public class CondicionNOT extends Condicion {
    private Condicion c1;

    public CondicionNOT(Condicion c1){
        this.c1 = c1;
    }

    public boolean cumple(Documento d){
        return !c1.cumple(d);
    }
}
