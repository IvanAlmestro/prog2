import java.util.Comparator;

public class ComparadorAND implements Comparator<Seguro> {
    private Comparator<Seguro> comp1;
    private Comparator<Seguro> comp2;

    
    public ComparadorAND(Comparator<Seguro> comp1, Comparator<Seguro> comp2) {
        this.comp1 = comp1;
        this.comp2 = comp2;
    }


    @Override
    public int compare(Seguro seguro, Seguro seguro2) {
        int resultadoComp1 = comp1.compare(seguro, seguro2);

        if (resultadoComp1 == 0) {
            // Si comp1 devuelve 0 (iguales), entonces utiliza comp2 para determinar el orden
            return comp2.compare(seguro, seguro2);
        }

        // Si comp1 devuelve un resultado diferente de 0, simplemente devuelve ese resultado
        return resultadoComp1;
    }
    
}
