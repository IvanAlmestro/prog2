import java.time.LocalDate;
import java.util.ArrayList;

public class Carpeta extends Elemento {

    private ArrayList<Elemento> elementos;



    public Carpeta(String nombre) {
        super(nombre);
        this.elementos = new ArrayList<>();

    }

    @Override
    public double calcularTamanio() {
        double tamTotal = 0.0;
        for(int i= 0; i<elementos.size();i++){
            tamTotal +=elementos.get(i).calcularTamanio();
        }
        return tamTotal;
    }

    @Override
    public int cantElementos() {
        int cantElementos = super.cantElementos();
        for(int i=0; i < elementos.size(); i++){
            Elemento elemHijo = elementos.get(i);
            cantElementos += elemHijo.cantElementos();
        }
        return cantElementos;
           
    }

    //tendria que ser  un for recorriendo elem
    public ArrayList<Elemento> getElementos() {
        return new ArrayList<>(elementos);
    }





    
}
