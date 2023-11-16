public class Producto {
    private String nombre;
    private double peso;
    private int costo;
    private String tipoMadera;
    private String color;
    private double aumento = 1.35;
    private int stock;

    public Producto(String nombre, double peso, int costo, String tipoMadera, String color, int stock){
        this.nombre = nombre;
        this.peso = peso;
        this.costo = costo;
        this.tipoMadera = tipoMadera;
        this.color = color;
        this.stock = stock;
        
    
    }
    public void agregarStock(int cantidad){
        stock +=cantidad;
    }
    
    public double getPrecio(){
        
        return this.costo*aumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public void setPrecio(double precio) {
    }

    public String getTipoMadera() {
        return tipoMadera;
    }

    public void setTipoMadera(String tipoMadera) {
        this.tipoMadera = tipoMadera;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getAumento() {
        return aumento;
    }

    public void setAumento(double aumento) {
        this.aumento = aumento;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
}   
