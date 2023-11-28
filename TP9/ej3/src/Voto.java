import java.time.LocalTime;

public class Voto {
    private LocalTime hora;
    private String referencia;
    
    public Voto(String referencia) {
        this.hora = LocalTime.now();
        this.referencia = referencia;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public LocalTime getHora() {
        return hora;
    }

}
