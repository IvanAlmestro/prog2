public class main {
    public static void main(String[] args) throws Exception {
       




        Contingente Ivan = new Futbolista("Ivan","almestro" , 23000, null, "En pais de origen", "delantero", "derecho", 23);

        System.out.println("El jugador : " + Ivan.getNombre() + " ¿esta disponible? " + " la respuesta es "+ Ivan.estaDisponible());
    }
}
