import java.util.Comparator;

public class ComparadorPoliza implements Comparator<Seguro> {

    @Override
    public int compare(Seguro o1, Seguro o2) {
       return o1.getNumeroPoliza()-o2.getNumeroPoliza();
    }
    
}
