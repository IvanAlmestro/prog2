import java.util.Comparator;

public class ComparadorXMoroso implements Comparator<Socio>{

    @Override
    public int compare(Socio s1, Socio s2) {
        // Primero compara alfabéticamente
        int comparadorAlbetico= s1.getNombre().compareTo(s2.getNombre());
        boolean pagoCuotaS1 = s1.pagoCuota();
        boolean pagoCuotaS2 = s2.pagoCuota();
        

        if(pagoCuotaS1 && !pagoCuotaS2){
            // s1 es moroso y s2 no, entonces s1 va antes
            return -1;
        }else if(!pagoCuotaS1 && pagoCuotaS2){
            return 1;
        }
        else{
            return comparadorAlbetico;
        }
    }
    
}
