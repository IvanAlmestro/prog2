public class CondicionDescripcion extends Condicion {
    private String descripcion;

    public CondicionDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean cumple(ObjetoAlquilado e) {
        return e.getDescripcion().contains(descripcion);
    }

}