import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private ArrayList<String> habilidades;
    private ArrayList<String> familiares;

    public Alumno(String nombre){
        this.nombre = nombre;
        habilidades = new ArrayList<>(habilidades);
        familiares = new ArrayList<>(familiares);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getHabilidades() {
        return habilidades;
    }


    public ArrayList<String> getFamiliares() {
        return familiares;
    }

 
    
    
}
