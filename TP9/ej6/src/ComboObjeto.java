import java.util.ArrayList;

public class ComboObjeto extends ObjetoAbstracto {
    private ArrayList<ObjetoAlquilado> objetos;

    @Override
    public int getAntiguedad() {
        int mayorAntiguedad = 0;
        for (int i = 0; i < objetos.size(); i++) {
            int antiguedadActual = objetos.get(i).getAntiguedad();
            if (mayorAntiguedad < antiguedadActual) {
                mayorAntiguedad = antiguedadActual;
            }
        }
        return mayorAntiguedad;
    }

    @Override
    public double getValor() {
        int valorTotal = 0;
        for (int i = 0; i < objetos.size(); i++) {
            valorTotal += objetos.get(i).getValor();

        }
        return valorTotal;
    }

    @Override
    public ArrayList<ObjetoAlquilado> buscarObjeto(Condicion c1) {
       ArrayList<ObjetoAlquilado> auxObjetos = new ArrayList<>();
        for(int i = 0; i< objetos.size(); i++){
            if(c1.cumple(objetos.get(i))){
                auxObjetos.add(objetos.get(i));

            }

        }
        return auxObjetos;
    }

}
