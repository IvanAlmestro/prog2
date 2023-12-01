import java.util.ArrayList;

public class Combo extends PaqueteAbstracto{

    private ArrayList<PaqueteAbstracto> elementos;

    public Combo(int id, int costoEnvio, int valorAsegurado, String destino) {
        super(id, costoEnvio, valorAsegurado, destino);
        //TODO Auto-generated constructor stub
    }

    public void addElemento(PaqueteAbstracto elemento){
        elementos.add(elemento);
    }

    @Override
    public int getPrecio() {
       return this.getPrecio();
    }

    @Override
    public int getValorAsegurado() {
       int valor = 0;
       for (PaqueteAbstracto elemento: elementos){
            valor+= elemento.getValorAsegurado();
       }
       return valor;
    }

    @Override
    public int getCantPaquete() {
        int cantPaquetes = 0;
        for(PaqueteAbstracto elemento: elementos){
            cantPaquetes += elemento.getCantPaquete();
        }
        return cantPaquetes;
    }

    @Override
    public Paquete getMayorValorAsegurado() {
        Paquete valorMayor = null;
     
        for(int i = 0; i < elementos.size(); i++){
            Paquete valorActual = elementos.get(i).getMayorValorAsegurado();
            if(valorMayor.getValorAsegurado() < valorActual.getValorAsegurado())
                valorMayor = valorActual;
                
        }
        return valorMayor;
    }

    @Override
    public PaqueteAbstracto getCopia() {
       ArrayList<PaqueteAbstracto> hijos = new ArrayList<>();
       
       for(int i = 0 ; i < elementos.size(); i++){
            PaqueteAbstracto copia = elementos.get(i).getCopia();
            if(copia != null){
                hijos.add(copia);
            }
       }
       if(hijos.size() > 0){
          Combo copiaCombo = new Combo(this.getId(), this.getCostoEnvio(), this.getValorAsegurado(), this.getDestino());
          for(PaqueteAbstracto elemento: hijos){
            copiaCombo.addElemento(elemento);

          }
          return copiaCombo;
       }else{
            return null;
       }
    }

    @Override
    public ArrayList<PaqueteAbstracto> buscar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscar'");
    }
    
}
