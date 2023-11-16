import java.util.ArrayList;

public class Provincia {

    private ArrayList<Ciudad> ciudades;
    
    public Provincia(){
        this.ciudades = new ArrayList<Ciudad>();

    }

    public boolean mitadCiudades(){
        int cantidadCiudades = 0;
        int mitadTamaño = (ciudades.size())/2;

        for(int i = 0; i < ciudades.size(); i++){
            if(ciudades.get(i).tieneDeficit()){
                cantidadCiudades++;
            }
            
        }
        return mitadTamaño > cantidadCiudades;
    }

    public ArrayList<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(ArrayList<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }
    public void addCiudad(Ciudad c){
        for(int i = 0; i < ciudades.size(); i++){
            if((ciudades.get(i).getHabitantes()) > (ciudades.get(i).getMinimoHabitantes())){
                ciudades.add(c);
                System.out.println("Ciudad Agregada");
            }else{
                System.out.println("La ciudad no cumple con los requisitos para ser agregada");
            }
        }
        
    }
}
