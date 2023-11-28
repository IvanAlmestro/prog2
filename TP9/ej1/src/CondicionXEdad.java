public class CondicionXEdad extends Condicion {
    private final int maxEdad = 18;

    public boolean cumple(Socio socio){
        return socio.getEdad() < maxEdad;
    }
}
