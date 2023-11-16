import java.util.ArrayList;

public class Pelicula {
    private String titulo;
    private String sinopsis;
    private ArrayList<String> generos;
    private String director;
    private ArrayList<String> actores;
    private int anioEstreno;
    private int duracionEnMin;
    private int edadRequerida;

    public Pelicula(String titulo, String sinopsis, String director, int anioEstreno, int duracionEnMin,
            int edadRequerida) {

        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.director = director;
        this.anioEstreno = anioEstreno;
        this.duracionEnMin = duracionEnMin;
        this.edadRequerida = edadRequerida;
        generos = new ArrayList<>();
        actores = new ArrayList<>();

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAnioEstreno() {
        return anioEstreno;
    }

    public void setAnioEstreno(int anioEstreno) {
        this.anioEstreno = anioEstreno;
    }

    public int getDuracionEnMin() {
        return duracionEnMin;
    }

    public void setDuracionEnMin(int duracionEnMin) {
        this.duracionEnMin = duracionEnMin;
    }

    public int getEdadRequerida() {
        return edadRequerida;
    }

    public void setEdadRequerida(int edadRequerida) {
        this.edadRequerida = edadRequerida;
    }

    public ArrayList<String> getGeneros() {
        return new ArrayList<>(generos);
    }

    public ArrayList<String> getActores() {
        return new ArrayList<>(actores);
    }

    

    
}
