public class CondicionXCuota extends Condicion {
    
    public boolean cumple(Socio socio){
        return socio.pagoCuota();
    }
}
