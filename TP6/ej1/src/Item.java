
public abstract class Item {
    private String nombre;
    protected int copiasDisp;

  

    public Item(String nombre, int copiasDisp) {
        this.nombre = nombre;
        this.copiasDisp = copiasDisp;
    }



    public abstract boolean estaAlquilado();

}
