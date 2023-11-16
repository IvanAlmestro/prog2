public class Personaje {
    private int fuerza;
    private int peso;
    private int velocidad;
    private int edad;
    private double altura;
    private int visionNocturna;
    private String nombreHeroe;
    private String nombreReal;

    public Personaje(int fuerza, int peso, int velocidad, int edad, double altura, int visionNocturna, String nombreHeroe, String nombreReal){
        this.fuerza = fuerza;
        this.peso = peso;
        this.velocidad = velocidad;
        this.edad = edad;
        this.altura = altura;
        this.visionNocturna = visionNocturna;
        this.nombreHeroe = nombreHeroe;
        this.nombreReal = nombreReal;
    }

    public boolean esMejorQue(Personaje otroPersonaje, String caracteristica){
        
        switch(caracteristica){
            case"visionNocturna":
                return this.visionNocturna > otroPersonaje.visionNocturna;
            case "velocidad":
                return this.velocidad >otroPersonaje.velocidad;
            case"edad":
                return this.edad > otroPersonaje.edad;
            case"peso":
                return this.peso > otroPersonaje.peso;
            case"altura":
                return this.altura > otroPersonaje.altura;
            case"fuerza":
                return this.fuerza > otroPersonaje.fuerza;
            default:
                return false;
        }
    }
}