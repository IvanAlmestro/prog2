public class CondicionCodigo extends Condicion {
    private int codigo;

    public CondicionCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public boolean cumple(ObjetoAlquilado e) {
        return e.getId() == this.codigo;
    }

}