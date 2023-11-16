public class CondicionXGenero extends Condicion {
    private String genero;
    
    public CondicionXGenero(String genero) {
        this.genero = genero;
    }

    public boolean cumple(Pelicula peli){
        return peli.getGeneros().contains(genero);
    }
}
