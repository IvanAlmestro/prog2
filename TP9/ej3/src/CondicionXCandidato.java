public class CondicionXCandidato extends Condicion{
    private String candidato;

    public CondicionXCandidato(String candidato){
        this.candidato = candidato;
    }
    @Override
    public boolean cumple(Voto voto) {
       return voto.getReferencia() == candidato;
    }
    
    public String getCandidato() {
        return candidato;
    }
    public void setCandidato(String candidato) {
        this.candidato = candidato;
    }
    
}
