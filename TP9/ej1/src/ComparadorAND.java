import java.util.Comparator;

public class ComparadorAND implements Comparator<Socio> {
    private Comparator<Socio> comp1;
    private Comparator<Socio> comp2;

    public ComparadorAND(Comparator<Socio> comp1, Comparator<Socio> comp2) {
        this.comp1 = comp1;
        this.comp2 = comp2;
    }

    @Override
    public int compare(Socio socio1, Socio socio2) {
        int resultadoComp1 = comp1.compare(socio1, socio2);

        if (resultadoComp1 == 0) {
            // Si comp1 devuelve 0 (iguales), entonces utiliza comp2 para determinar el orden
            return comp2.compare(socio1, socio2);
        }

        // Si comp1 devuelve un resultado diferente de 0, simplemente devuelve ese resultado
        return resultadoComp1;
    }
}