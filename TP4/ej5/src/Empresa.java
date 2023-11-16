import java.util.ArrayList;

public class Empresa {
    private ArrayList<Persona> personas;


    public Empresa(){
        personas = new ArrayList<>();
    }


    public ArrayList<Persona> getPersonas() {
        return personas;
    }


    public void addPersona(Persona nueva){
        personas.add(nueva);
    }

    public void removePersona(Persona p){
        personas.remove(p);
    }
}
