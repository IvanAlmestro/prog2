import java.util.ArrayList;

public class Planta {
    private String nombreCientifico;
    private ArrayList<String> nombresVulgares;
    private String clasificacion;
    private String familia;
    private String clase;
    private String tipo;
    private int cant_riego;
    private int cant_sol;

    public Planta(String nombreCientifico, String clasificacion, String familia, String clase, String tipo,
            int cant_riego, int cant_sol) {
        this.nombreCientifico = nombreCientifico;
        this.clasificacion = clasificacion;
        this.familia = familia;
        this.clase = clase;
        this.tipo = tipo;
        this.cant_riego = cant_riego;
        this.cant_sol = cant_sol;
        nombresVulgares = new ArrayList<>();
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCant_riego() {
        return cant_riego;
    }

    public void setCant_riego(int cant_riego) {
        this.cant_riego = cant_riego;
    }

    public int getCant_sol() {
        return cant_sol;
    }

    public void setCant_sol(int cant_sol) {
        this.cant_sol = cant_sol;
    }
    
    public void addNombreVulgar(String nombre){
        nombresVulgares.add(nombre);
    }
   public void removeNombreVulgar(String nombre){
        nombresVulgares.remove(nombre);
    }

    public ArrayList<String> getNombresVulgares() {
        return new ArrayList<>(nombresVulgares);
    }
        
}
