import java.time.LocalDate;

public class Contacto {
    private String nombre;
    private LocalDate fecha_nacimiento;
    private String numCelular;
    private String apellido;
    private String ciudad;

    public Contacto(String nombre,LocalDate fecha_nacimiento, String numCelular, String apellido, String ciudad){
        this.nombre = nombre;
        this.numCelular = numCelular;
        this.apellido = apellido;
        this.ciudad = ciudad;

    }
    public boolean contactoRepetido(Contacto otroContacto){
        return (this.numCelular.equals(otroContacto.numCelular) 
        && this.nombre.equals(otroContacto.nombre)
        && this.apellido.equals(otroContacto.apellido));

    }
    public int calcularEdad(){
        LocalDate hoy = LocalDate.now();
        int edad = hoy.getYear() - fecha_nacimiento.getYear();
        return edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }
    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    public String getNumCelular() {
        return numCelular;
    }
    public void setNumCelular(String numCelular) {
        this.numCelular = numCelular;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    

}
