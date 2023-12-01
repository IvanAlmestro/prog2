import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        Criterio criSueldo = new CriterioSueldo();
        Criterio criHoras = new CriterioHoras(7);
        Consultora consultora = new Consultora();
        Candidato juan = new Candidato("juan", "MacDonals", 120000, criSueldo);
        Candidato Ivan = new Candidato("ivan", "MacDonals", 140000, criHoras);


        Laburo laburo1 = new Laburo(23, 160000, "Riot");
        Laburo laburo2 = new Laburo(30, 190000, "Apple");
        Laburo laburo3 = new Laburo(7, 350000, "Globant");

        
        consultora.addCandidato(Ivan);
        consultora.addCandidato(juan);

        ArrayList<Candidato> candidatos = consultora.obtenerCandidatos(laburo3);
        
        System.out.println(candidatos);
    }
}
