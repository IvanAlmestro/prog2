public class CondicionXPalabra extends Condicion{
    private String palabraClave;

    
    public CondicionXPalabra(String palabraClave) {
        this.palabraClave = palabraClave;
    }

    public boolean cumple(Documento doc){
        return doc.getPalabrasClave().contains(palabraClave);
    }
}
