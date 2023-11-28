import java.util.Comparator;

public class ComparadorEdad implements Comparator<Socio> {

    @Override
    public int compare(Socio s1, Socio s2) {
        int edadS1 = s1.getEdad();
        int edadS2 = s2.getEdad();

        if (edadS1 < edadS2) {
            return -1; // s1 es más joven que s2
        } else if (edadS1 > edadS2) {
            return 1; // s1 es más viejo que s2
        } else {
            return 0; // s1 y s2 tienen la misma edad
        }
    }
}