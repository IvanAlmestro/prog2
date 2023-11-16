import java.util.ArrayList;

public class Lote {
    private String nombre;
    private ArrayList<String> minerales;
    private double tamanio;
    
    //comun o especial?

    public Lote(String nombre, double tamanio){
        minerales = new ArrayList<>(minerales);
        this.tamanio = tamanio;
        this.nombre = nombre;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }
    

    public String getNombre() {
        return nombre;
    }
 
    public ArrayList<String> getMinerales() {
        return new ArrayList<String>(minerales);

    }   
   
}
