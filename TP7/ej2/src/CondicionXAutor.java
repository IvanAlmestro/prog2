public class CondicionXAutor extends Condicion {
    private String autor;
    
    public CondicionXAutor(String autor) {
        this.autor = autor;
    }

    public boolean cumple(Documento doc){
        return doc.getAutores().contains(autor);
    }
}
