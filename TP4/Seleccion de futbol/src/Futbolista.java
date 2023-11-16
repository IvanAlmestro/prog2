import java.time.LocalDate;

public class Futbolista extends Contingente{
    private String posicion;
    private String piernaHabil;
    private int cantGoles;

    public Futbolista(String nombre, String apellido, int numeroPasaporte, LocalDate fnac, String estado, String posicion, String piernaHabil, int cantGoles ){
        super( nombre,  apellido,  numeroPasaporte,  fnac,  estado);
        this.posicion = posicion;
        this.piernaHabil = piernaHabil;
        this.cantGoles = cantGoles;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getPiernaHabil() {
        return piernaHabil;
    }

    public void setPiernaHabil(String piernaHabil) {
        this.piernaHabil = piernaHabil;
    }

    public int getCantGoles() {
        return cantGoles;
    }

    public void setCantGoles(int cantGoles) {
        this.cantGoles = cantGoles;
    }
    
}
