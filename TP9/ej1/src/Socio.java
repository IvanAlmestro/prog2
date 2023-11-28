import java.util.ArrayList;

public class Socio {
    private String nombre, apellido;
    private int edad;
    private ArrayList<Alquiler> alquileresPago;
    private boolean pagoCuota;

    public Socio(String nombre, String apellido, int edad, boolean pagoCuota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.alquileresPago = new ArrayList<>();
        this.pagoCuota = pagoCuota;
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

    public int getEdad() {
        return edad;
    }
    public int cantAlquiloCancha(int id_cancha){
        int cantidad= 0;
        for(int i=0; i<alquileresPago.size(); i++){
            if(alquileresPago.get(i).getId_cancha()== id_cancha){
                cantidad++;
            }

        }
        return cantidad;
    }


    public ArrayList<Alquiler> getAlquileresPago() {
        return new ArrayList<Alquiler>(alquileresPago) ;
    }

    public boolean pagoCuota(){
        return pagoCuota;
    }
    public void setPagoCuota(boolean pagoCuota) {
        this.pagoCuota = pagoCuota;
    }

    public void addAlquiler(Alquiler a){
        alquileresPago.add(a);
    }
    
}
