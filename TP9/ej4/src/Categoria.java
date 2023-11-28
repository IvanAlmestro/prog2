import java.util.ArrayList;

public class Categoria extends ElementoSN {

    private ArrayList<ElementoSN> elementos;
    private String imagen, descripcion;

    

    

    public Categoria( String imagen, String descripcion) {
        this.elementos = new ArrayList<>();
        this.imagen = imagen;
        this.descripcion = descripcion;
    }



    public String getImagen() {
        return imagen;
    }



    public void setImagen(String imagen) {
        this.imagen = imagen;
    }



    public String getDescripcion() {
        return descripcion;
    }



    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }



    //metodo recursivo
    @Override
    public int getCantNoticias() {
        int cantNoticias = 0;
        for(int i = 0; i < elementos.size(); i++){
            // Suma la cantidad de noticias de cada elemento
            cantNoticias += elementos.get(i).getCantNoticias();
        }
        return cantNoticias;

    }



    public ArrayList<ElementoSN> getElementos() {
        return new ArrayList<>(elementos);
    }



    @Override
    public ArrayList<Noticia> buscarNoticias(Condicion c) {
        ArrayList<Noticia> aux = new ArrayList<>();
        for(ElementoSN elemento : elementos) {
            aux.addAll(elemento.buscarNoticias(c));
        }
        return aux;
    }
    
}
