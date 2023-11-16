import java.util.ArrayList;


public class ProductoQuimico {
    private String nombre;
    private ArrayList<Cultivo> cultivosNoRecomendados;
    private ArrayList<String> enfermedadesTratadas;

    public ProductoQuimico(){
        cultivosNoRecomendados = new ArrayList<>();
        enfermedadesTratadas = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<Cultivo> getCultivosNoRecomendados() {
        return new ArrayList<Cultivo>();
    }
    public void addCultivo(Cultivo nuevo){
        cultivosNoRecomendados.add(nuevo);

    }
    public void removeCultivo(Cultivo c){
        cultivosNoRecomendados.remove(c);

    }
    
    public ArrayList<String> getEnfermedadesTratadas(){
        return new ArrayList <>(enfermedadesTratadas);
    }
}
