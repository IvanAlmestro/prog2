import java.util.ArrayList;

public class ObjetoAlquilado extends ObjetoAbstracto implements Comparable<ObjetoAlquilado> {
    private String descripcion;
    private int valor, id, antiguedad;

    public ObjetoAlquilado(String descripcion, int valor, int id, int antiguedad) {
        this.descripcion = descripcion;
        this.valor = valor;
        this.id = id;
        this.antiguedad = antiguedad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public ArrayList<ObjetoAlquilado> buscarObjeto(Condicion c1) {
        ArrayList<ObjetoAlquilado> objetosAux = new ArrayList<>();
        if(c1.cumple(this)){
            objetosAux.add(this);

        }
        return objetosAux;
    }

    @Override
    public int compareTo(ObjetoAlquilado o) {
       int rta = this.getId() - o.getId();
       if(rta == 0){
         return this.getAntiguedad() - o.getAntiguedad();
       }
       return rta;

    }

}
