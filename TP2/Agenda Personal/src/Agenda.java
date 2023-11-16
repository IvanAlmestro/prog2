import java.util.ArrayList;

public class Agenda {
    private ArrayList<Reunion> reuniones;
    


    public Agenda(){
        this.reuniones = new ArrayList<Reunion>();
    }

    public void addReunion(Reunion rr){
        
        reuniones.add(rr);
    }

    public void removeReunion(Reunion reunion) {
        if (reuniones.contains(reunion)) {
            reuniones.remove(reunion);
        }
    }

    public ArrayList<Reunion> getReuniones() {
        return reuniones;
    }
    
}
