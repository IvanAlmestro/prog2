import java.time.LocalDate;

public class Comprimido extends Carpeta{
    
    private double tasaCompresion;

    public Comprimido(String nombre) {
        super(nombre);

    }

    @Override
    public double calcularTamanio() {

        return super.calcularTamanio()*tasaCompresion;
    }
    
}
