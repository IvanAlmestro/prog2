public class Empleado {
     
    private double sueldo;
    private String nombre;
    private String apellido;
    private Empleado tipo;
    private int dni;

    public Empleado(double sueldo, String nombre, String apellido, Empleado tipo, int dni) {
        this.sueldo = sueldo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipo = tipo;
        this.dni = dni;
    }

  
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Empleado getTipo() {
        return tipo;
    }

    public void setTipo(Empleado tipo) {
        this.tipo = tipo;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public double calcularSueldo(){
        return sueldo;
    }

    

   
}
