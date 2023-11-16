public class App {
    public static void main(String[] args) throws Exception {
       
        Condicion condicionLengua = new CondicionNombreIgual("lengua");
        Vivero vivero= new Vivero();
        Planta jazmin=new Planta(null, null, null, null, null, 0, 0);
        vivero.addPlanta(jazmin);
        vivero.buscarPlantas(condicionLengua);


        Condicion  condicionContenga = new CondicionContengaNombre("auereum");

        Condicion auereumANDLengua = new CondicionAND(condicionContenga,condicionLengua);
        vivero.buscarPlantas(auereumANDLengua);
    }   
}
