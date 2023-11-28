import java.util.ArrayList;

public class Seguro extends SeguroAbstracto{
    private String descripcion;
    private int nroPoliza, dni;
    private double monto;
    Costo costo;

    
    public Seguro(String descripcion, int nroPoliza, int dni, double monto, Costo costo) {
        this.descripcion = descripcion;
        this.nroPoliza = nroPoliza;
        this.dni = dni;
        this.monto = monto;
        this.costo = costo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public int getNumeroPoliza() {
   
        return nroPoliza;
    }

    @Override
    public double getCosto() {
        return costo.getCosto();
    }

    @Override
    public ArrayList<Seguro> buscarSeguros(Condicion condicion) {
        ArrayList<Seguro> lista = new ArrayList<>();
        if(condicion.cumple(this)){
            lista.add(this);
        }
        return lista;
    }

    
}
