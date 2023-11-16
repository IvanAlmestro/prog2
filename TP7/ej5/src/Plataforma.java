import java.util.ArrayList;

public class Plataforma {
    private ArrayList<Pelicula> peliculas;
    
    public Plataforma(){
        peliculas = new ArrayList<>();
    }

    public ArrayList<Pelicula> getPeliculas() {
        return new ArrayList<>(peliculas);
    }
    public void addPelicula(Pelicula pe){
        peliculas.add(pe);
    }

    public ArrayList<Pelicula> buscarPelicula(Condicion c){
        ArrayList<Pelicula> aux = new ArrayList<>();
        for(int i = 0; i<peliculas.size(); i++){
            Pelicula peli = peliculas.get(i);
            if (c.cumple(peli)) {
                aux.add(peli);
            }
            
        }
        return aux;
    }

    
}
