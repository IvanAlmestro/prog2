public class CondicionXAnio extends Condicion {
    private int anio;

    public CondicionXAnio(int anio) {
        this.anio = anio;
    }
    // pregunta si cumple lo que se haya grabado 
    //antes del anio que te den
    public boolean cumple(Pelicula peli){
        return peli.getAnioEstreno() < anio;
    }
}
