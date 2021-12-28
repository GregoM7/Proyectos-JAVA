package Parcial;

public class ObraSocial extends Paciente implements Comparable{
    private String nombreObraSocial;
    private int nroAsociado;

    @Override
    public int compareTo(Object obj) {
        ObraSocial variableInterna= (ObraSocial) obj;
        if(this.nroAsociado>variableInterna.nroAsociado){
            return 1;
        }else if(this.nroAsociado< variableInterna.nroAsociado){
            return -1;
        }else{
            return 0;
        }
    }

    public ObraSocial(String fechaNacimiento, String nombre, String apellido, boolean primerConsulta, Consulta consultaPaciente, String nombreObraSocial, int nroAsociado) {
        super(fechaNacimiento, nombre, apellido, primerConsulta, consultaPaciente);
        this.nombreObraSocial = nombreObraSocial;
        this.nroAsociado = nroAsociado;
    }

    public String getNombreObraSocial() {
        return nombreObraSocial;
    }

    public void setNombreObraSocial(String nombreObraSocial) {
        this.nombreObraSocial = nombreObraSocial;
    }

    public int getNroAsociado() {
        return nroAsociado;
    }

    public void setNroAsociado(int nroAsociado) {
        this.nroAsociado = nroAsociado;
    }
}
