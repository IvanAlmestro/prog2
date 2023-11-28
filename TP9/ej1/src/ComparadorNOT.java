import java.util.Comparator;

public class ComparadorNOT implements Comparator<Socio> {
    private Comparator<Socio> comparadorOriginal;

    public ComparadorNOT(Comparator<Socio> comparadorOriginal) {
        this.comparadorOriginal = comparadorOriginal;
    }

    @Override
    public int compare(Socio socio1, Socio socio2) {
        // Invertir el resultado de la comparación original
        return -1 * comparadorOriginal.compare(socio1, socio2);
    }
}