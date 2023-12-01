public class CriterioSueldo extends Criterio{
    
    @Override
    public boolean cumple(Candidato cand, Laburo l) {
       return l.getMontoOfrecido()  >= cand.getSueldoActual();
    }
    
}
