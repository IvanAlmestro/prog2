import java.util.ArrayList;

public class Cooperativa {
    private ArrayList<String> mineralesPrimarios;
    private ArrayList<Cereal> cereales;
    private ArrayList<Lote> lotes;
    
    public Cooperativa(){
        mineralesPrimarios = new ArrayList<>();
        cereales = new ArrayList<>();
        lotes = new ArrayList<>();
    }

    public ArrayList<String> getMineralesPrimarios() {
        return new ArrayList<String>(mineralesPrimarios);
    }   
    
    public ArrayList<Lote> getLotes() {
        return new ArrayList<>(lotes);
    }

    public boolean esEspecial(Lote lote){
        return lote.getMinerales().containsAll((getMineralesPrimarios()));
    }
    
    public ArrayList<Cereal> puedeSembrarse(Lote lote){

        ArrayList<Cereal> auxiliar = new ArrayList<>();

        for(int i = 0; i<cereales.size(); i++){
            Cereal cereal = cereales.get(i);

            if(lote.getMinerales().containsAll(cereal.getMineralRequerido())){
                auxiliar.add(cereal);
            }
        }
        return auxiliar;
    }
}
