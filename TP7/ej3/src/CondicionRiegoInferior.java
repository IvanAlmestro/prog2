public class CondicionRiegoInferior {
    private int cant_riego;
    

    public CondicionRiegoInferior(int cant_riego) {
        this.cant_riego = cant_riego;
    }


    public boolean cumple(Planta p){
        return p.getCant_riego()<cant_riego;
    }
}
