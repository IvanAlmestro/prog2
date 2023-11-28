import java.util.ArrayList;

public class Empresa{
    private ArrayList<ObjetoAlquilado> objetos;

    public Empresa() {
        this.objetos = new ArrayList<>();

    }
    
    public void addObjeto(ObjetoAlquilado objeto){
        objetos.add(objeto);
    }

    public ArrayList<ObjetoAlquilado> buscar(Condicion c1){
        ArrayList<ObjetoAlquilado> aux = new ArrayList<>();

        for(int i = 0; i < objetos.size(); i ++){
            if (c1.cumple(objetos.get(i))) {
    
                aux.addAll((objetos.get(i).buscarObjeto(c1)));
            }
        }
        return aux;
    }
    
}
