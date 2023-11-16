import java.util.ArrayList;

public class Celular {
    private ArrayList<Contacto> contactos;
    
    public Celular(){
        contactos = new ArrayList<Contacto>();
    }

    public void addContacto(Contacto c){
        contactos.add(c);
    }
    public void removeContacto(Contacto c){
        contactos.remove(c);
    }
 
    public void mostrarInfo(){
        for(int i = 0; i<contactos.size(); i++){
            System.out.println("Nombre y apellido: "+ contactos.get(i).getNombre() + contactos.get(i).getApellido()+
                               "Edad promedio: " + promedioEdad());
            mostrarContactoRepetido();
        }
        
    }
    public double promedioEdad(){
        int suma = 0;
        int cantidad = 0;
        for(int i = 0; i < contactos.size(); i++){
            suma += contactos.get(i).calcularEdad();
            cantidad++;
        }
        return suma/cantidad;
    }

    public void mostrarContactoRepetido(){
        
        for(int i = 0; i<contactos.size();i++){
            Contacto otroContacto = contactos.get(i);

            if(contactos.get(i).contactoRepetido(otroContacto)){
                System.out.println("Nombre: " + contactos.get(i).getNombre());
                System.out.println("Apellido: " + contactos.get(i).getApellido());
                System.out.println("Número de Teléfono: " + contactos.get(i).getNumCelular());
         
            }
        }
       
    }
}
