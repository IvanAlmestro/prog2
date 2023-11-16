public class Main {
    public static void main(String[] args){
        FabricaMuebles fabrica = new FabricaMuebles();

        Producto silla = new Producto("Silla", 5.0, 600, "roble", "azul", 3);
        Producto mesa = new Producto("Mesa", 20.0, 1000, "pino", "marron", 10);
        Producto banco = new Producto("Banco", 10.0, 1000, "roble", "blanco", 13);
        
        silla.agregarStock(30);
        mesa.agregarStock(20);
        banco.agregarStock(10);

        fabrica.addProducto(silla);
        fabrica.addProducto(mesa);
        fabrica.addProducto(banco);

        double precioTotal = fabrica.getAllPrecio();
        System.out.println("El precio total de venta de los productos en stock es de: " + precioTotal);

        double precioSilla = silla.getPrecio();
        System.out.println("El precio de venta de la silla es de: $" + precioSilla);
        double precioMesa = mesa.getPrecio();
        System.out.println("El precio de venta de la mesa es de: $" + precioMesa);
    }
}
