import java.util.ArrayList;

public class Establecimiento {
    private ArrayList<Socio> socios;

    public Establecimiento() {
        this.socios = new ArrayList<>();
    }

    public ArrayList<Socio> getSocios() {
        return new ArrayList<>(socios);
    }
    public void addSocio(Socio socio){
        socios.add(socio);
    }
    
    public ArrayList<Socio> buscarSocio(Condicion c){

        ArrayList<Socio> aux = new ArrayList<>();

        for(int i = 0; i < socios.size(); i++){
            if (c.cumple(socios.get(i))) {
                aux.add(socios.get(i));
            }
        }
        return aux;
    }
    public int cantSocios() {
        return socios.size();
    }
}
