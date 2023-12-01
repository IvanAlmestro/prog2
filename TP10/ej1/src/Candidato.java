public class Candidato {
    private String nombre, empresaActual;
    private double sueldoActual;
    private Criterio criterioLaboral;
    
    public Candidato(String nombre, String empresaActual, double sueldoActual, Criterio criterioLaboral) {
        this.nombre = nombre;
        this.empresaActual = empresaActual;
        this.sueldoActual = sueldoActual;
        this.criterioLaboral = criterioLaboral;
    }

        @Override
    public String toString() {

        return "\t CANDIDATO: \n"+
        " Nombre: " + nombre + "\n"
        + "Empresa Actual: " +empresaActual+ "\n"
        + "Sueldo Actual: " +sueldoActual+
        "\n --------------- \n";
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresaActual() {
        return empresaActual;
    }

    public void setEmpresaActual(String empresaActual) {
        this.empresaActual = empresaActual;
    }

    public double getSueldoActual() {
        return sueldoActual;
    }

    public void setSueldoActual(double sueldoActual) {
        this.sueldoActual = sueldoActual;
    }

    public Criterio getCriterioLaboral() {
        return criterioLaboral;
    }

    public void setCriterioLaboral(Criterio criterioLaboral) {
        this.criterioLaboral = criterioLaboral;
    }
    

}
