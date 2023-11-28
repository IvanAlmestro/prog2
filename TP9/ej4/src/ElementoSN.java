import java.util.ArrayList;

public abstract class ElementoSN {
    
    public abstract int getCantNoticias();

    public abstract ArrayList<Noticia> buscarNoticias(Condicion c);
}
