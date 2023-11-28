public class CondicionXPago extends Condicion {
    private int precio;

public CondicionXPago(int precio) {
    this.precio = precio;
}

    public boolean cumple(Socio s) {
        for (int i = 0; i < s.getAlquileresPago().size(); i++) {
            if (s.getAlquileresPago().get(i).getCosto() > precio) {
                return true;  // Si al menos un alquiler cumple la condición, retornar true.
            }
        }
        return false;  // Si no se encuentra ningún alquiler que cumpla la condición, retornar false.
    }

}