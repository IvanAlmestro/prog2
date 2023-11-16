import java.util.ArrayList;

public class Pelicula extends Item {
    private String info;
    private final int minimoCopias = 0;


    public Pelicula(String nombre, int copiasDisp, String info){
        super(nombre, copiasDisp);
        this.info = info;
    }


    @Override
    public boolean estaAlquilado() {
       return super(copiasDisp) > minimoCopias;
    }
}
