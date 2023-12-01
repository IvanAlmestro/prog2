import java.util.Comparator;

public class ComparadorCostoFabricacion implements Comparator<Pedido>{

    @Override
    public int compare(Pedido p1, Pedido p2) {
        return p1.getCostoFabricar() - p2.getCostoFabricar();
    }
    
}
