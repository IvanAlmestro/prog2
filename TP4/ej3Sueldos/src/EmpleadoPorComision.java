public class EmpleadoPorComision extends Empleado{

    private double comision;

    public EmpleadoPorComision(double salarioFijo, double comision, String nombre) {
        super(salarioFijo, nombre);
        this.comision = comision;
    }
    
    public double getSueldoComision(){
        return comision + super.getSalarioFijo();
    }
}
