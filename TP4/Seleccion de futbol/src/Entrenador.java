import java.time.LocalDate;

public class Entrenador extends Contingente {
    private int identificador;

    public Entrenador(String nombre, String apellido, int numeroPasaporte, LocalDate fnac, String estado, int identificador){
        super(nombre, apellido, numeroPasaporte, fnac, estado);
        this.identificador =identificador;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    
}
