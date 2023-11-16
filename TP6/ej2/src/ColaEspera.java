import java.util.ArrayList;

public class ColaEspera {
    private ArrayList<Computadora> computadoras;
    private ArrayList<Proceso> procesos;

    public ColaEspera(){
        computadoras = new ArrayList<>();
        procesos = new ArrayList<>();
    }


    public void addProceso(Proceso nuevo) {
        int index = 0;
        for (int i = 0; i < procesos.size(); i++) {
            if (nuevo.getRequerimientoMemoria() >= procesos.get(i).getRequerimientoMemoria()) {
                index = i + 1;
            } else {
                break;
            }
        }
        procesos.add(index, nuevo);
    }
    
     public void addComputadora(Computadora computadora) {
        int index = 0;
        for (int i = 0; i < procesos.size(); i++) {
            if (computadora.getRequerimientoMemoria() >= procesos.get(i).getRequerimientoMemoria()) {
                index = i + 1;
            } else {
                break;
            }
        }
        procesos.add(index, nuevo);
    }

    public void removeProceso(Proceso proceso){
        procesos.remove(proceso);
    }
    public void removeComputadora(Computadora compu){
        computadoras.remove(compu);
    }
}
