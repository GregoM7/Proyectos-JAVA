public class PacienteObraSocial extends Paciente implements Comparable{
    private String nombreObraSocial;
    private int numeroAsociado;

    public PacienteObraSocial(Integer fechaNacimiento, String nombre, String apellido, Boolean primeraConsulta, Consulta consulta, String nombreObraSocial, int numeroAsociado) {
        super(fechaNacimiento, nombre, apellido, primeraConsulta, consulta);
        this.nombreObraSocial = nombreObraSocial;
        this.numeroAsociado = numeroAsociado;
    }

    @Override
    public int compareTo(Object o){
        PacienteObraSocial paciente = (PacienteObraSocial)o;
        int resp=0;
        if (this.numeroAsociado > paciente.numeroAsociado){
            resp=1;
        }
        if(this.numeroAsociado< paciente.numeroAsociado){
            resp=-1;
        }
        return resp;
    }
}
