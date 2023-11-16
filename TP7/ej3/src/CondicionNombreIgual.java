public class CondicionNombreIgual extends Condicion {
    
    private String nombre;

    public CondicionNombreIgual(String nombre){
        this.nombre = nombre;
    }

    public boolean cumple(Planta p){
        return p.getNombresVulgares().contains(nombre);
    }
}
