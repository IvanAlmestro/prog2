import java.util.ArrayList;

public class Consultora {
    private ArrayList<Candidato> candidatos;


    public Consultora() {
        this.candidatos = new ArrayList<>() ;
    }

    public ArrayList<Candidato> getCandidatos() {
        return new ArrayList<>(candidatos);
    }
    public void addCandidato(Candidato nuevoCandidato) {
        this.candidatos.add(nuevoCandidato);
    }
    public ArrayList<Candidato> obtenerCandidatos(Laburo laburo){
        ArrayList<Candidato> aux = new ArrayList<>();

        for(int i = 0 ; i < candidatos.size(); i++){
            Criterio criterio = candidatos.get(i).getCriterioLaboral();
            if (criterio.cumple(candidatos.get(i), laburo)) {
                aux.add(candidatos.get(i));
            }
        }
        return aux;
    }
    
}
