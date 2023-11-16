import java.util.ArrayList;

public class Usuario {

    private String Nombre;
    private ArrayList<Turno> turnos;
    private int cantTurnos= 4;
    



    public Usuario(){
        this.turnos = new ArrayList<>(turnos);
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public ArrayList<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(ArrayList<Turno> turnos) {
        this.turnos = turnos;
    }

    public int getCantTurnos() {
        return cantTurnos;
    }

    public void setCantTurnos(int cantTurnos) {
        this.cantTurnos = cantTurnos;
    }

    public void addTurno(Turno t){
        turnos.add(t);
    }
    public boolean esSocio(){
        return turnos.size()>=cantTurnos;
    }

}
