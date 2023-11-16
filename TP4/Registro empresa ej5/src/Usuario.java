public class Usuario extends Persona {
    private String nombreUsuario;
    private String contraseña;

    public Usuario(String nombre, String apellido, int edad, String nombreUsuario, String contraseña){
        super(nombre, apellido, edad);
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Usuario [nombreUsuario=" + nombreUsuario + ", contraseña=" + contraseña + "]";
    }
    
}
