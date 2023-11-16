public class Luz {

    private boolean encendida;
    
    public Luz(){
        this.encendida = false;
    }

    public void encender(boolean SioNo){
        this.encendida = SioNo;
    }

    public boolean isEncendida() {
        return encendida;
    }

    
}
