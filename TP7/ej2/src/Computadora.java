import java.util.ArrayList;

public class Computadora {
    private ArrayList<Documento> documentos;

    public Computadora(){
        documentos = new ArrayList<>();
    }

    public ArrayList<Documento> getDocumentos() {
        return new ArrayList<>(documentos);
    }
    
}
