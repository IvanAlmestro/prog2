public class CondicionTituloXPalabra extends Condicion{
    private String palabraClave;

    
    public CondicionTituloXPalabra(String palabraClave) {
        this.palabraClave = palabraClave;
    }

    public boolean cumple(Documento doc){
        return doc.getTitulo().contains(palabraClave);
    }
}
