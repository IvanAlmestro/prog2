import java.util.ArrayList;

public class Temporada {
   
    private int numero;
	// contiene episodios
	private ArrayList<Episodio> episodios;

	public Temporada(int num) {
		numero = num;
		this.episodios = new ArrayList<>();
	}

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

   
    public void agregarEpisodio(Episodio ep){
        this.episodios.add(ep);
    }
    public int getEpisodiosVistos(){
        int contador= 0;
        for(int i = 0; i< episodios.size(); i++){
            Episodio e = this.episodios.get(i);	
            if(e.isVisto()){
                contador++;

            }
        }
        return contador;
    }
    public double promedioCalif(){
        
        int sumaCalif=0;
        int cantCalif=0;
        
        for(int i = 0; i <episodios.size();i++){
            if(this.episodios.get(i).isVisto()){
            sumaCalif += this.episodios.get(i).getCalificacion();
            cantCalif++;
            }
        }
        return sumaCalif/cantCalif;
    }
    public boolean vioTodosEpis(){
        return this.episodios.size() == this.getEpisodiosVistos();
    }
}
