import java.util.ArrayList;

public class Alarma {
    private ArrayList<Sensor> sensores;

    protected Timbre timbre;
    public Alarma(){
        this.sensores = new ArrayList<>();
        this.timbre = new Timbre();
    }
  
    // comentario
    public void comprobar(Timbre timbre){
        //if(sensores.rompioVidrio() || sensores.abrioVentana() || sensores.hayMovimiento()){
            timbre.hacerSonar();
            for(int i = 0; i<sensores.size(); i++){
                System.out.println(sensores.get(i).getZona());
            }
       // }
    }
    public void sonarAlarma(){
        this.timbre.hacerSonar();
    }
    public void addSensor(Sensor sensor){
        sensores.add(sensor);
    }
}
