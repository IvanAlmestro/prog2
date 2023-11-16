public class CondicionXTitulo extends Condicion{
    private String titulo;
    
    public CondicionXTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean cumple(Documento doc){
        return doc.getTitulo().equals(titulo);
    }



}