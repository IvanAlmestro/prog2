import java.time.LocalDate;

public class Masajista extends Contingente {
    private String titulo;
    private int añosExp;
    public Masajista(String nombre, String apellido, int numeroPasaporte, LocalDate fnac, String estado, String titulo, int añosExp){
        super(nombre, apellido, numeroPasaporte, fnac, estado);
        this.añosExp = añosExp;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getAñosExp() {
        return añosExp;
    }
    public void setAñosExp(int añosExp) {
        this.añosExp = añosExp;
    }

    
}
