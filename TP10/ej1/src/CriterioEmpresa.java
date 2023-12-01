public class CriterioEmpresa extends Criterio {

    @Override
    public boolean cumple(Candidato cand, Laburo laburo) {
       return !(laburo.getEmpresa().equals(cand.getEmpresaActual()));
    }
    
}
