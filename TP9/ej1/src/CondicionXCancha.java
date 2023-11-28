public class CondicionXCancha extends Condicion{
    
    private int canchaId;
    private int cantVecesAlquilo;

    public CondicionXCancha(int canchaId) {
        this.canchaId = canchaId;
    }

    public boolean cumple(Socio socio){
        return socio.cantAlquiloCancha(canchaId)>cantVecesAlquilo;
    }

    public int getCanchaId() {
        return canchaId;
    }

    public int getCantVecesAlquilo() {
        return cantVecesAlquilo;
    }

    public void setCanchaId(int canchaId) {
        this.canchaId = canchaId;
    }

    public void setCantVecesAlquilo(int cantVecesAlquilo) {
        this.cantVecesAlquilo = cantVecesAlquilo;
    }

    
    
}
