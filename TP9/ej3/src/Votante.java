public class Votante {

    private int dni;
    private boolean emitioVoto;

    public Votante(int dni){
        this.dni = dni;
        this.emitioVoto = false;
    }

    public int getDni() {
        return dni;
    }

    public boolean isEmitioVoto() {
        return emitioVoto;
    }

    public void setEmitioVoto(boolean emitioVoto) {
        this.emitioVoto = emitioVoto;
    }

    
    
}
