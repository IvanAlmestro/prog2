import java.util.ArrayList;

public class SeguroIntegrador extends SeguroAbstracto {
    private ArrayList<Seguro> seguros;
    private int dni;

    public SeguroIntegrador(int dni) {
        this.seguros = new ArrayList<>();
        this.dni = dni;
    }

    public ArrayList<Seguro> getSeguros() {
        return new ArrayList<>(seguros);
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getNumeroPoliza() {
        int polizaMayor = 0;
        for (int i = 0; i < seguros.size(); i++) {
            int polizaActual = seguros.get(i).getNumeroPoliza();
            if (polizaMayor < polizaActual) {
                polizaMayor = polizaActual;
            }
        }
        return polizaMayor;
    }

    public double getMonto() {
        double monto = 0;
        for (int i = 0; i < seguros.size(); i++) {
            monto += seguros.get(i).getMonto(); // Llama recursivamente al método getMonto() del seguro en la posición i
        }
        return monto;
    }

    
    @Override
    public double getCosto() {
        double costo= 0.0;
        for(int i = 0; i < seguros.size(); i++){
            SeguroAbstracto seguro = seguros.get(i);
            costo += seguro.getCosto();
        }
        return costo;
    }   

    @Override
    public ArrayList<Seguro> buscarSeguros(Condicion condicion) {
        ArrayList<Seguro> aux = new ArrayList<>();
        for(int i = 0; i < seguros.size(); i++){
            if(condicion.cumple(seguros.get(i))){
                aux.add(seguros.get(i));
            }
        }
        return aux;
    }
}
