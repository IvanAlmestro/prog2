import java.time.LocalDate;

public class Contingente {
    private String nombre;
    private String apellido;
    private int numeroPasaporte;
    private LocalDate fnac;
    private String estado;
   

    public Contingente(String nombre, String apellido, int numeroPasaporte, LocalDate fnac, String estado){
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroPasaporte = numeroPasaporte;
        this.fnac = fnac;
        this.estado = estado;
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


    public int getNumeroPasaporte() {
        return numeroPasaporte;
    }


    public void setNumeroPasaporte(int numeroPasaporte) {
        this.numeroPasaporte = numeroPasaporte;
    }


    public LocalDate getFnac() {
        return fnac;
    }


    public void setFnac(LocalDate fnac) {
        this.fnac = fnac;
    }


    public String getEstado() {
        return estado;
    }


    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean estaDisponible(){
        String estado = this.getEstado();
        if(estado.equalsIgnoreCase("En pais de origen")){
            if(!estado.equalsIgnoreCase("En concentracion")){
                return true;
            }
        }
        return false;
    }
}
