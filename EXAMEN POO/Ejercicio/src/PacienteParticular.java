public class PacienteParticular extends Paciente{
    private Double precioConsulta;
    private int dni;

    public PacienteParticular(Integer fechaNacimiento, String nombre, String apellido, Boolean primeraConsulta, Consulta consulta, Double precioConsulta, int dni) {
        super(fechaNacimiento, nombre, apellido, primeraConsulta, consulta);
        this.precioConsulta = precioConsulta;
        this.dni = dni;
    }
}
