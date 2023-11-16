public class CondicionNOT extends Condicion {
    private Condicion c;

    public CondicionNOT(Condicion c) {
        this.c = c;
    }

    public boolean cumple(Planta p) {
        return !c.cumple(p);
    }
}
