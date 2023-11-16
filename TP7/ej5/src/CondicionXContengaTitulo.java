public class CondicionXContengaTitulo extends Condicion {
    private String titulo;

    public CondicionXContengaTitulo(String titulo){
        this.titulo = titulo;
    }
    

    public boolean cumple(Pelicula peli){
        return peli.getTitulo().contains(titulo);
    }
}
