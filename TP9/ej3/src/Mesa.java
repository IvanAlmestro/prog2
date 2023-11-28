import java.util.ArrayList;

public class Mesa {
    private ArrayList<Votante> votantes;
    private ArrayList<Voto> votos;

    public Mesa() {
        this.votantes = new ArrayList<>();
        this.votos = new ArrayList<>();
    }

    public ArrayList<Votante> getVotantes() {
        return new ArrayList<>(votantes);
    }

    public ArrayList<Voto> getVotos() {
        return new ArrayList<>(votos);
    }

    public void addVoto(Voto nuevo, Votante votante) {
        boolean emitioVoto = votante.isEmitioVoto();

        for (int i = 0; i < votantes.size(); i++) {
            if (votantes.get(i).getDni() == votante.getDni() && !emitioVoto) {
                votos.add(nuevo);
                votante.setEmitioVoto(true);
            }
        }
    }

    public int cantVotos(Condicion c1) {
        int cantVotos = 0;
        for (int i = 0; i < votos.size(); i++) {
            if (c1.cumple(votos.get(i))) {
                cantVotos++;
            }
        }
        return cantVotos;
    }

    public double porcentajeVotos(Condicion cond) {
        int cantVotos = cantVotos(cond);
        int votosTotal = votos.size();

        return cantVotos / votosTotal * 100;
    }

    public int getVotosMesa() {
        return votos.size();
    }

}
