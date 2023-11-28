import java.util.Comparator;

public class ComparadorNOT implements Comparator<Seguro> {
    private Comparator<Seguro> comp1;
    
    public ComparadorNOT(Comparator<Seguro> comp1) {
        this.comp1 = comp1;
    }

    @Override
    public int compare(Seguro o1, Seguro o2) {
        return -1* comp1.compare(o1, o2);
    }
    
}
