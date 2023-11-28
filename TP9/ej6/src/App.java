import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        
        Empresa empresa = new Empresa();
        ObjetoAlquilado silla = new ObjetoAlquilado("Silla", 400, 32, 12);
        ObjetoAlquilado silla2 = new ObjetoAlquilado("Silla", 400, 33, 12);
        ObjetoAlquilado silla3 = new ObjetoAlquilado("Silla", 400, 31, 12);
        ObjetoAlquilado mesa = new ObjetoAlquilado("Mesa", 2003, 13, 8);
        ObjetoAlquilado sillon = new ObjetoAlquilado("Sillon", 431, 3, 5);

        ObjetoAlquilado Mesavencida = new ObjetoDeprecado("Makita", 1203102, 23, 8, 2);


        Condicion condDescripcion = new CondicionDescripcion("Silla");

       empresa.addObjeto(silla);
       empresa.addObjeto(silla2);
       empresa.addObjeto(silla3);
       empresa.addObjeto(mesa);
       empresa.addObjeto(sillon);
       empresa.addObjeto(Mesavencida);

       ArrayList<ObjetoAlquilado> objetosAlquilados = new ArrayList<>(empresa.buscar(condDescripcion));
   
       System.out.println('\n' + " Listar todos los elementos que en la descripción contenga la palabra Makita");
       for (ObjetoAlquilado objeto : objetosAlquilados) {
           System.out.println("Descripcion: " + objeto.getDescripcion() + " id: " + objeto.getId());
       }


    }
}
