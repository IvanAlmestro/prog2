public class EmpleadoConVenta extends Empleado{
    private double extraVenta;

    public EmpleadoConVenta(double sueldo, String nombre, String apellido, Empleado tipo, int dni) {
        super(sueldo, nombre, apellido, tipo, dni);

    }
    @Override
    public double calcularSueldo(){
        return super.calcularSueldo() + extraVenta;
    }

}
