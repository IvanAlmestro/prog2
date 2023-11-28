import java.util.Comparator;

public class ComparadorAlquileres implements Comparator<Socio> {
    private int idCancha;

    
    public ComparadorAlquileres(int idCancha) {
        this.idCancha = idCancha;
    }


    @Override
    public int compare(Socio s1, Socio s2) {
        int alquileresS1 = s1.cantAlquiloCancha(idCancha);
        int alquileresS2 = s2.cantAlquiloCancha(idCancha);
    
        if (alquileresS1 > alquileresS2) {
            return 1;
        } else if (alquileresS1 < alquileresS2) {
            return -1;
        }
    
        return 0;
    }
}
