import java.util.ArrayList;

public class Noticia extends ElementoSN {
    private String titulo, introduccion, texto, autor, link;
    private ArrayList<String> palabrasClave;

    public Noticia(String titulo, String introduccion, String texto, String autor, String link) {
        this.titulo = titulo;
        this.introduccion = introduccion;
        this.texto = texto;
        this.autor = autor;
        this.link = link;
        this.palabrasClave = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIntroduccion() {
        return introduccion;
    }

    public void setIntroduccion(String introduccion) {
        this.introduccion = introduccion;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public ArrayList<String> getPalabrasClave() {
        return new ArrayList<>(palabrasClave);
    }

    @Override
    public int getCantNoticias() {
        return 1;
    }

    @Override
    public ArrayList<Noticia> buscarNoticias(Condicion c) {
        ArrayList<Noticia> aux = new ArrayList<>();
        if(c.cumple(this)){
            aux.add(this);
        }
        return aux;
    }

    
}
