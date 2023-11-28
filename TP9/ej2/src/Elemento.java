import java.time.LocalDate;

public abstract class Elemento {
    private String nombre;
    private LocalDate fechaCreacion;
    private Carpeta contenedor = null;
    
    public Elemento(String nombre) {
        this.nombre = nombre;
  
        this.fechaCreacion = LocalDate.now();
    }

    
    public String getNombre() {
        return nombre;
    }


    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }


    public Carpeta getContenedor() {
        return contenedor;
    }
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public abstract double calcularTamanio();
    public int cantElementos(){
        return 1;
    }


}
