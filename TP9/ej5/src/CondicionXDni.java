public class CondicionXDni extends Condicion{
    private int dni;
    
    public CondicionXDni(int dni) {
        this.dni = dni;
    }

    @Override
    public boolean cumple(Seguro seguro) {
      return seguro.getDni() == dni;
    }
    
}
