import java.util.ArrayList;

public class Lugar {
    private ArrayList<Mesa> mesas;

    public Lugar() {
        this.mesas = new ArrayList<>();
    }

    public ArrayList<Mesa> getMesas() {
        return new ArrayList<>(mesas);
    }

    public double porcVotosLugar(Condicion c1) {
        int cantTotalVotos = 0;
        int cantVotos = 0;

        for (int i = 0; i < mesas.size(); i++) {
            cantVotos += mesas.get(i).cantVotos(c1);
            cantTotalVotos += mesas.get(i).getVotosMesa();
        }
        return (cantVotos / cantTotalVotos) * 100;
    }
}
