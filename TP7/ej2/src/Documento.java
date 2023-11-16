import java.util.ArrayList;

public class Documento{
    private String titulo;
    private ArrayList<String> autores;
    private String contenidoTextual;
    private ArrayList<String> palabrasClave;

    public Documento(String titulo,  String contenidoTextual) {
        this.titulo = titulo;
        this.contenidoTextual = contenidoTextual;
        autores = new ArrayList<>(autores);
        palabrasClave = new ArrayList<>(palabrasClave);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenidoTextual() {
        return contenidoTextual;
    }

    public void setContenidoTextual(String contenidoTextual) {
        this.contenidoTextual = contenidoTextual;
    }

    public ArrayList<String> getAutores() {
        return new ArrayList<>(autores);
    }

    public ArrayList<String> getPalabrasClave() {
        return new ArrayList<>(palabrasClave) ;
    }

    

    
}