public class CondicionContengaNombre extends Condicion {
    
    private String nombre;

    public CondicionContengaNombre(String nombre){
        this.nombre = nombre;
    }

    public boolean cumple(Planta p){
        return p.getNombreCientifico().contains(nombre);
    }
}
