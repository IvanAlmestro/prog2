import java.util.ArrayList;
import java.util.Comparator;

public class Fabrica {
    private ArrayList<Pedido> pedidos;
    private Comparator<Pedido> comparador;

    public Fabrica(Comparator<Pedido> comparador) {
        this.pedidos = new ArrayList<>();
        this.comparador = comparador;
    }

    public ArrayList<Pedido> getPedidos() {
        return new ArrayList<>(pedidos) ;
    }

    public double getGanaciaTotal(){
        double gananciaActual = 0.0;
        double gananciaTotal = 0.0;
        for(int i = 0 ; i < pedidos.size(); i++){
            Pedido j = pedidos.get(i);
            gananciaActual = j.getPrecioVenta() - j.getCostoFabricar();
            gananciaTotal +=gananciaActual;
        }
        return gananciaTotal;
    }
    
    public boolean aceptaPedido(Condicion c1, Pedido pedido){
        return c1.cumple(pedido);
    }
    public void addPedido(Condicion c1, Pedido pedido){
        if(aceptaPedido(c1, pedido)){
            int pos = 0;
            while ((pos < pedidos.size()) && (comparador.compare(pedidos.get(pos), pedido)> 0)){
                pos++;
            }
            pedidos.add(pos, pedido);
        }
    }
}
