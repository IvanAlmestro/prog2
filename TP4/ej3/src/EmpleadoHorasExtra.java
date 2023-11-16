public class EmpleadoHorasExtra extends Empleado {

    private double montoExtra;

    public EmpleadoHorasExtra(double salarioFijo, double montoExtra, String nombre) {
        super(salarioFijo, nombre);
        this.montoExtra = montoExtra;
    }

    public double getSueldoHoraExtra(){
        return montoExtra + super.getSalarioFijo();
    }
}
