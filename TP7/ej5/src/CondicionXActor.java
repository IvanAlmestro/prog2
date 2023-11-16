public class CondicionXActor extends Condicion {
    private String actor;
    
    public CondicionXActor(String actor) {
        this.actor = actor;
    }

    public boolean cumple(Pelicula peli){
        return peli.getActores().contains(actor);
    }
}
