import java.util.ArrayList;

public class FabricaMuebles {
    private ArrayList<Producto> productos;


    public FabricaMuebles(){
        productos = new ArrayList<>();
    }

    public void addProducto(Producto p){
        productos.add(p);
    }
    public double getAllPrecio(){
        double suma = 0 ;
        for(int i = 0; i< productos.size(); i++){
            suma+=this.productos.get(i).getPrecio();
        }
        return suma;
    }
}
