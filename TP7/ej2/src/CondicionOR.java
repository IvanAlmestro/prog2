public class CondicionOR extends Condicion{
    private Condicion c1, c2;

    public CondicionOR(Condicion c1, Condicion c2) {
        this.c1= c1;
        this.c2 = c2;
    }

    public boolean cumple(Documento d) {
        return c1.cumple(d) || c2.cumple(d);
    }
}