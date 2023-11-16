import java.util.ArrayList;

public class Enfermedad {
    private ArrayList<String> estadosPatologicos;
    private String nombre;

    public Enfermedad(String nombre){
        estadosPatologicos = new ArrayList<>();
    }

    public ArrayList<String> getEstadosPatologicos() {
        return new ArrayList<>(estadosPatologicos);
    }

 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
