public class CondicionXDirector extends Condicion {
    private String director;
    
    public CondicionXDirector(String director) {
        this.director = director;
    }

    public boolean cumple(Pelicula peli){
        return peli.getDirector().equals(director);
    }
}