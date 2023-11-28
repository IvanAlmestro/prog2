import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class App {
    public static void main(String[] args) throws Exception {
        Alquiler alquiler1 = new Alquiler(13, LocalDate.of(2023, 8, 15), 501);
        Alquiler alquiler2 = new Alquiler(2, LocalDate.of(2023, 8, 20), 601);
        Alquiler alquiler3 = new Alquiler(3, LocalDate.of(2023, 8, 25), 701);
        Alquiler alquiler4 = new Alquiler(13, LocalDate.of(2023, 8, 10), 5511);
        Alquiler alquiler5 = new Alquiler(13, LocalDate.of(2023, 8, 10), 5511);
        Alquiler alquiler6 = new Alquiler(1, LocalDate.of(2023, 8, 10), 5533);
        Alquiler alquiler7 = new Alquiler(1, LocalDate.of(2023, 8, 10), 131);

        Socio Ivan = new Socio("Ivan", "Almestro", 9, true);
        Socio Seba = new Socio("Sebastian", "Almestro", 14, false);
        Socio Julian = new Socio("Julian", "Almestro", 15, false);
        Socio Seba2 = new Socio("Sebastian2", "Almestro", 10, true);
        Socio Julian2 = new Socio("Julian2", "Almestro", 12, false);

        Ivan.addAlquiler(alquiler1);
        Ivan.addAlquiler(alquiler2);

        Seba.addAlquiler(alquiler3);
        Seba.addAlquiler(alquiler4);

        Seba2.addAlquiler(alquiler5);

        Julian.addAlquiler(alquiler6);
        Julian.addAlquiler(alquiler7);

        Establecimiento club = new Establecimiento();
        club.addSocio(Julian);
        club.addSocio(Ivan);
        club.addSocio(Seba);
        club.addSocio(Seba2);


        Condicion cuotaPaga = new CondicionXCuota();
        Condicion cuotaImpaga = new CondicionNOT(cuotaPaga);
        Condicion menorEdad = new CondicionXEdad();
        Condicion mayorEdad = new CondicionNOT(menorEdad);
        Condicion cancha = new CondicionXCancha(13);
        Condicion pago = new CondicionXPago(500);

        Comparator<Socio> compApellidoNombre = new ComparadorApellidoNombre();
        Comparator<Socio> compEdad = new ComparadorEdad();
        Comparator<Socio> compCantAlquileres = new ComparadorAlquileres(13);
        Comparator<Socio> compMoroso = new ComparadorXMoroso();
        Comparator<Socio> compMorosoANDApellido = new ComparadorAND(compApellidoNombre, compMoroso);


        ArrayList<Socio> morosos = club.buscarSocio(cuotaImpaga);
        Collections.sort(morosos, compApellidoNombre);
        System.out.println('\n' + "Lista de Socios con cuota impaga Ordenada por Nombre y Apellido:");
        for (Socio socio : morosos) {
            System.out.println("Nombre: " + socio.getNombre() + ", Apellido: " + socio.getApellido());
        }


        ArrayList<Socio> sociosXEdad = club.buscarSocio(menorEdad);
        Collections.sort(sociosXEdad, compEdad);
        System.out.println('\n' + "Todos los socios menores de edad, ordenados por edad:");
        for (int i = 0; i < sociosXEdad.size(); i++) {
            System.out.println("Nombre: " + sociosXEdad.get(i).getNombre() + ", Apellido: " + sociosXEdad.get(i).getApellido() + ", Edad: " + sociosXEdad.get(i).getEdad());

        }

        ArrayList<Socio> ejd = club.buscarSocio(pago);
        Collections.sort(ejd, compMorosoANDApellido);
        System.out.println('\n' + ") Todos los socios que pagaron más de $500 por algún alquiler de cancha, listando\r\n" + //
                "primero los que tienen las cuotas pagas, ordenados alfabéticamente y luego los\r\n" + //
                "morosos, también ordenados alfabéticamente.");
        for (int i = 0; i < ejd.size(); i++) {
            System.out.println("Nombre: " + ejd.get(i).getNombre() + ", Apellido: " + ejd.get(i).getApellido() + ", Pago? : " + sociosXEdad.get(i).pagoCuota());

        }

    }
}
