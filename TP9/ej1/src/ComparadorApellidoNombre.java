import java.util.Comparator;

public class ComparadorApellidoNombre implements Comparator<Socio> {

    @Override
    public int compare(Socio s1, Socio s2) {

        int comparacionApellido = s1.getApellido().compareTo(s2.getApellido());
        
        if(comparacionApellido == 0){
            return s1.getNombre().compareTo(s2.getNombre());
        }
        return comparacionApellido;
    }
}
