import java.util.ArrayList;

public class Cereal {
    private String nombre;
    private ArrayList<String> mineralRequerido;
    
    public Cereal(String nombre){
        this.nombre =nombre;
        mineralRequerido = new ArrayList<>(mineralRequerido);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getMineralRequerido() {
        return new ArrayList<>(mineralRequerido) ;
    }

    public boolean puedeSembrarse(Lote lote){
        return mineralRequerido.containsAll(lote.getMinerales());
    }

    
}
