import java.util.ArrayList;

public abstract class ObjetoAbstracto {
    
    public abstract int getAntiguedad();
    public abstract double getValor();
    public abstract ArrayList<ObjetoAlquilado> buscarObjeto(Condicion c1);
}
