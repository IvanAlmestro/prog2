public class CondicionSolSuperior extends Condicion{
    private  int nivelSol;

    
    public CondicionSolSuperior(int nivelSol) {
        this.nivelSol = nivelSol;
    }


    public boolean cumple(Planta p){
        return p.getCant_sol() > nivelSol;
    }
    
}
