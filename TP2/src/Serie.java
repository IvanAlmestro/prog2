import java.util.ArrayList;

public class Serie {
  
    private String titulo;
    private String descripcion;
    private String creador;
    private String genero;
    private ArrayList<Temporada> temporadas;



    public Serie(Temporada temporadas, String titulo, String creador, String genero){
        this.temporadas = new ArrayList<>();
        this.titulo =titulo;
        this.creador = creador;
        this.genero = genero;
    }
    public int getEpisodiosVistos(Episodio e){
        int contador = 0;
        for(int i = 0; i < temporadas.size() ; i++){
           contador += temporadas.get(i).getEpisodiosVistos();
        }
        return contador;
    }
    public void agregarTemp(Temporada t){
        this.temporadas.add(t);
    }
    public ArrayList<Temporada> getTemporadas() {
        return temporadas;
    }
    public void setTemporadas(ArrayList<Temporada> temporadas) {
        this.temporadas = temporadas;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getCreador() {
        return creador;
    }
    public void setCreador(String creador) {
        this.creador = creador;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    
    
}
