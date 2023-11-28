public class CondicionXDescripcion extends Condicion {
    private String palabra;
    
    public CondicionXDescripcion(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public boolean cumple(Seguro seguro) {
        return seguro.getDescripcion().contains(palabra);
    }
    
}
