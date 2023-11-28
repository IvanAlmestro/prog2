import java.util.ArrayList;

public abstract class SeguroAbstracto {

    public abstract int getNumeroPoliza();
    public abstract double getMonto();
    public abstract double getCosto();
    public abstract ArrayList<Seguro> buscarSeguros(Condicion condicion);
}
