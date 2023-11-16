public class Sensor{
    private String zona;
    private String tipo;
    private boolean activo;
    
    public Sensor(){
        this.setZona(zona);
        this.setTipo(tipo);
        this.activo = false;
    }
    
    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    /*  public boolean hayMovimiento(){
        return 
    }
    public boolean abrioVentana(){
        
    }
    public boolean rompioVidrio(){
        
    }*/
   
    public String getZona(){
        return zona;
    }

    public void activar(){
        this.activo = true;
    }
    
    public void desactivar(){
        this.activo = false;
    }

    public boolean isActivo(){
        return activo;
    }
}
