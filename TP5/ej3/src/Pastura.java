public class Pastura extends Cereal {
    private final double maxtamanio = 50;

    public Pastura(String nombre){
        super(nombre);
    }

    @Override
    public boolean puedeSembrarse(Lote lote) {
        
        return super.puedeSembrarse(lote) && lote.getTamanio() < maxtamanio;
    }
}
