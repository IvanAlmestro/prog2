import java.util.ArrayList;

public class Jerarquico extends Persona {
   
    private int nroLegajo;
    private double sueldo;
    private ArrayList<Empleado> empleados;

     public Jerarquico(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);

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

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void addEmpleado(Empleado nuevo){
        empleados.add(nuevo);
    }
    
    
}
