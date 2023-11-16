public class main {
    public static void main(String[] args){
        Empleado Ivan = new Empleado(200000, "Ivan");
        System.out.println("Sueldo: "+ Ivan.getSalarioFijo() + " nombre: " + Ivan.getNombre());

        EmpleadoHorasExtra Ivano = new EmpleadoHorasExtra(20000, 1000, "Ivano");
        System.out.println("Sueldo: "+ Ivano.getSueldoHoraExtra() + " nombre: " + Ivano.getNombre());

        
        EmpleadoPorComision Ivanol = new EmpleadoPorComision(100000, 1000, "Ivanol");
        System.out.println("Sueldo: "+ Ivanol.getSueldoComision() + " nombre: " + Ivanol.getNombre());

    }
}
