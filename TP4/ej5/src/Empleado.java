public class Empleado extends Persona{

    private int nroLegajo;
    private double sueldo;

    public Empleado(String nombre, String apellido, int edad, int nroLegajo, double sueldo) {
        super(nombre, apellido, edad);
        this.nroLegajo = nroLegajo;
        this.sueldo = sueldo;

    }

    public int getNroLegajo() {
        return nroLegajo;
    }



    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    
}
