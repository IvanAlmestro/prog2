import java.util.ArrayList;

public class Cliente{
    private String nombre;
    private String apellido;
    
    private ArrayList<Alquiler> alquileres;

    public Cliente(String nombre, String apellido){
        alquileres = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ArrayList<Alquiler> getAlquileres(){
        return new ArrayList<Alquiler>();
    }
    public void addAlquiler(Alquiler nuevo){
        alquileres.add(nuevo);
    }
    public void removeAlquiler(Alquiler a){
        alquileres.add(a);
    }
    
}
