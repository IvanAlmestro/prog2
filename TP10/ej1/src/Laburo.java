public class Laburo {
    private int horasSemanales;
    private double montoOfrecido;
    private String empresa;
    
    public Laburo(int horasSemanales, double montoOfrecido, String empresa) {
        this.horasSemanales = horasSemanales;
        this.montoOfrecido = montoOfrecido;
        this.empresa = empresa;
    }

    public int getHorasSemanales() {
        return horasSemanales;
    }

    public void setHorasSemanales(int horasSemanales) {
        this.horasSemanales = horasSemanales;
    }

    public double getMontoOfrecido() {
        return montoOfrecido;
    }

    public void setMontoOfrecido(double montoOfrecido) {
        this.montoOfrecido = montoOfrecido;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    
    
}
