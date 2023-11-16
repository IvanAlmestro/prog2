public class Episodio{
    private int calificacion;
    private boolean visto;
    private String titulo;
    private String descripcion;
    private int minCalif= 1;
    private int maxCalif= 5;

    public Episodio(){}

    public Episodio(String titulo, boolean visto, int calificacion){
        this.titulo =titulo;
        this.calificacion = calificacion;
        this.visto = visto;
    }
    public int getCalificacion() {
        return calificacion;
    }
    public void setCalificacion(int calificacion) {
        
        if(calificacion >= minCalif && calificacion <= maxCalif){
            this.calificacion = calificacion;
            this.setVisto(true);
        }else{
            System.out.println("El valor ingresado no es correcto");
        }
    }

    public void setVisto(boolean visto) {
        this.visto = visto;
    }


    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getDescripcion() {
        return descripcion;
    }


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public boolean isVisto() {
            return visto;
    }
    public void setSeVio(boolean visto) {
        this.visto = visto;
    }
    
    
}
