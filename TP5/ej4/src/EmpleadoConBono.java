public class EmpleadoConBono extends Empleado{
    private int cantVentas;
    private int ventasNecesarias;
    private int bono;

    public EmpleadoConBono(double sueldo, String nombre, String apellido, Empleado tipo, int dni, int cantVentas, int ventasNecesarias, int bono) {
        super(sueldo, nombre, apellido, tipo, dni);
        this.bono = bono;
        this.ventasNecesarias = ventasNecesarias;
        this.cantVentas = cantVentas;
    }
    
    @Override
    public double calcularSueldo(){
        if(cantVentas>=ventasNecesarias)
            return super.calcularSueldo() + bono;
        
        return super.calcularSueldo();
    }
}
