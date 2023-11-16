import java.util.ArrayList;

public class Casa {
    private int capacidadMaxima;
    private ArrayList<String> habilidadRequerida;
    private ArrayList<Alumno> alumnos;
    private ArrayList<CasaEnemiga> enemigos;

    public Casa(int capacidadMaxima){
        this.capacidadMaxima = capacidadMaxima;
        alumnos = new ArrayList<>(alumnos);
        habilidadRequerida = new ArrayList<>(habilidadRequerida);
    }

    public int getCantMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }
    
    public boolean casaLlena(){
        return alumnos.size() >= capacidadMaxima;
    }
    public boolean tieneFamiliarEnCasa(Alumno alumno) {
        for (Alumno miembro : alumnos) {
            if (alumno.getFamiliares().contains(miembro.getNombre())) {
                return true;
            }
        }
        return false;
    }

    public boolean noEsEnemigo(Alumno alumno) {
        if (enemigos.isEmpty()) {
            return true; // Si la lista de enemigos está vacía, no hay enemistades.
        }

        for (int i = 0; i < enemigos.size(); i++) {
            CasaEnemiga enemigo = enemigos.get(i);
            if (alumno.getFamiliares().contains(enemigo)) {
                return false; // Si encontramos un enemigo, retornamos false.
            }
        }

        return true; // Si no se encontraron enemigos, retornamos true.
    }

    public boolean poseeHabilidades(Alumno a){
        
        return habilidadRequerida.containsAll(a.getHabilidades());
    }

    public void addHabilidad(String nueva){
        habilidadRequerida.add(nueva);
    }

    public void removeHabilidad(String h){
        habilidadRequerida.remove(h);
    }

    public void addAlumno(Alumno a){
        if(!casaLlena() && )
    }

    public void addEnemigo(String casaEnemiga) {
        enemigos.add(casaEnemiga);
    }


    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public ArrayList<String> getHabilidadRequerida() {
        return habilidadRequerida;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public ArrayList<String> getEnemigos() {
        return enemigos;
    }


    
}
