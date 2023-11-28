import java.time.LocalTime;

public class CondicionXHora extends Condicion {
    private LocalTime horaMenor;
    private LocalTime horaMayor;
    
    public CondicionXHora(LocalTime horaMenor, LocalTime horaMayor) {
        this.horaMenor = horaMenor;
        this.horaMayor = horaMayor;
    }

    @Override
    public boolean cumple(Voto voto) {
        return voto.getHora().isBefore(horaMenor) && voto.getHora().isAfter(horaMayor) ;
    }
    
}
