import java.util.ArrayList;

public class Juego {

    private ArrayList<Personaje> personajes;

    public Juego(){
        personajes = new ArrayList<>();
    }
    public Personaje esGanador(Personaje p1, Personaje p2, String caracteristica){
        if(p1.esMejorQue(p2, caracteristica)){
            return p1;
        }else if(p2.esMejorQue(p1, caracteristica)){
            return p2;
        }else{
            return null; //En caso de empate
        }
    }
    public void addPersonaje(Personaje p){
        personajes.add(p);
    }

    public void removePersonaje(Personaje p){
        personajes.remove(p);
    }

}
