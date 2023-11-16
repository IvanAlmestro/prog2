public class Timbre {
    private boolean sonando;

    public Timbre(){
        this.sonando =false;
    }
    public void hacerSonar(){
        System.out.println("Timbre sonando");
    }
    public boolean isSonando() {
        return sonando;
    }
    public void setSonando(boolean sonando) {
        this.sonando = sonando;
    }
    
    public void apagar(){
        this.sonando = false;
        System.out.println("Timbre apagado");
    }
}
