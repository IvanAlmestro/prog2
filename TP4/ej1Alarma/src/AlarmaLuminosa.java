public class AlarmaLuminosa extends Alarma {
    private Luz luz;

    public AlarmaLuminosa(){
        this.luz = new Luz();
    }

    public void comprobar(Timbre timbre, Luz luz){
            super.sonarAlarma();
            luz.encender(true);
            
    }
}
