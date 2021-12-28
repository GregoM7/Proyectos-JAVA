package Parcial;

public abstract class Paciente {

    private String fechaNacimiento;
    private String nombre;
    private String apellido;
    private boolean primerConsulta;
    private Consulta consultaPaciente;

    public boolean evaluacionInicial(){
        if(primerConsulta){
            return true;
        }else{
            return false;
        }
    }

    public Paciente(String fechaNacimiento, String nombre, String apellido, boolean primerConsulta, Consulta consultaPaciente) {
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.primerConsulta = primerConsulta;
        this.consultaPaciente = consultaPaciente;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean isPrimerConsulta() {
        return primerConsulta;
    }

    public void setPrimerConsulta(boolean primerConsulta) {
        this.primerConsulta = primerConsulta;
    }
}
