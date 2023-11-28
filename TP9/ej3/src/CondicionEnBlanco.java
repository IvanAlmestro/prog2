public class CondicionEnBlanco extends Condicion{

    @Override
    public boolean cumple(Voto voto) {
       return voto.getReferencia() == null;
    }
    
}
