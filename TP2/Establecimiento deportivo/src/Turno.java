public class Turno {
    private double turnoFutbol;
    private double turnoPadel;
    private double descuento = 0.10;

    public Turno(double turnoFutbol, double turnoPadel){
        this.turnoFutbol = 400.0;
        this.turnoPadel = 100.0;
    }
    public Turno(int turno){
        this.turnoFutbol = turno;
    }
    
  
    public double getTurnoFutbol() {
        return turnoFutbol;
    }
    public void setTurnoFutbol(double turnoFutbol, Usuario u) {
        if(u.esSocio()){
            this.turnoFutbol = turnoFutbol*descuento;
        }else{
            this.turnoFutbol = turnoFutbol;
        }
        
    }
    public double getTurnoPadel() {
        return turnoPadel;
    }
     public void setTurnoPadel(double turnoPadel, Usuario u) {
        if(u.esSocio()){
            this.turnoPadel = turnoPadel*descuento;
        }else{
            this.turnoPadel = turnoPadel;
        }
        
    }
    public double getDescuento() {
        return descuento;
    }
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    
}
