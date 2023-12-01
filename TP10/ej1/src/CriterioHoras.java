public class CriterioHoras  extends Criterio{
    private int horasQueAcepta;
    public CriterioHoras(int horasQueAcepta){
        this.horasQueAcepta = horasQueAcepta;
    }
    @Override
    public boolean cumple(Candidato cand, Laburo l) {
       return this.horasQueAcepta >= l.getHorasSemanales();
    }

    public int getHorasQueAcepta() {
        return horasQueAcepta;
    }
    public void setHorasQueAcepta(int horasQueAcepta) {
        this.horasQueAcepta = horasQueAcepta;
    }
    
    
}
