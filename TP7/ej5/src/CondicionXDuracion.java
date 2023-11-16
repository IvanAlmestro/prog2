public class CondicionXDuracion extends Condicion {
    private int duracion;
    

    public CondicionXDuracion(int duracion) {
        this.duracion = duracion;
    }


    public boolean cumple(Pelicula peli){
        return peli.getDuracionEnMin()<duracion;
    }
}
