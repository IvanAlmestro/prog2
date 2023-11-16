import java.util.ArrayList;

public class Vivero {
    private ArrayList<Planta> plantas;

    public Vivero(){
        plantas = new ArrayList<>();
    }

    public void addPlanta(Planta nueva){
        plantas.add(nueva);
    }
    public void removePlanta(Planta p){
        plantas.remove(p);
    }

    public ArrayList<Planta> getPlantas() {
        return new ArrayList<Planta>(plantas);
    }

    public ArrayList<Planta> buscarPlantas(Condicion c){
        ArrayList<Planta> aux = new ArrayList<>();
        
        for(int i = 0; i<plantas.size(); i++){
            Planta p = plantas.get(i);
            if(c.cumple(p)){
                aux.add(p);
            }
        }
        return aux;
    }
}
