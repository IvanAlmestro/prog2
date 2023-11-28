public class ObjetoDeprecado extends ObjetoAlquilado {
    private int duracionMeses;
    private double porcentaje = 2;

    public ObjetoDeprecado(String descripcion, int valor, int id, int antiguedad, int duracionMeses) {
        super(descripcion, valor, id, antiguedad);
        this.duracionMeses = duracionMeses;
    }

    @Override
    public double getValor() {
        if (this.getAntiguedad() < duracionMeses) {
            return this.getValor();
        }else{
            int cantMeses=0;
            cantMeses = this.getAntiguedad() - duracionMeses;
            porcentaje = porcentaje * cantMeses;
            double porcentajeValor = this.getValor() * porcentaje ;
            return this.getValor() - porcentajeValor;
        }
    }

    @Override
    public int getAntiguedad() {
        return super.getAntiguedad();
    }

    public int getDuracionMeses() {
        return duracionMeses;
    }

    public void setDuracionMeses(int duracionMeses) {
        this.duracionMeses = duracionMeses;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    
}
