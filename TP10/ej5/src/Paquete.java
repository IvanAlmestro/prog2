import java.util.ArrayList;

public class Paquete extends PaqueteAbstracto {
    private Condicion condicion;


    public Paquete(int id, int costoEnvio, int valorAsegurado, String destino, Condicion condicion) {
        super(id, costoEnvio, valorAsegurado, destino);
        this.condicion = condicion;
    }


    @Override
    public int getPrecio() {
        return this.getPrecio();
    }

    @Override
    public int getValorAsegurado() {
        return this.getValorAsegurado();
    }

    @Override
    public int getCantPaquete() {
        return 1;
    }

    @Override
    public Paquete getMayorValorAsegurado() {
       return this;
    }

    @Override
    public PaqueteAbstracto getCopia() {
        return new Paquete(this.getId(), this.getCostoEnvio(), this.getValorAsegurado(), this.getDestino(), this.condicion);
    }

    @Override
    public ArrayList<PaqueteAbstracto> buscar() {
        ArrayList<PaqueteAbstracto> aux = new ArrayList<>();

        if(condicion.cumple(this)){
            aux.add(this);
        }
        return aux;
    }



}
