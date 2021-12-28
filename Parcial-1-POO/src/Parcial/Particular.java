package Parcial;

public class Particular extends Paciente{

    private double cobroConsulta;
    private String dni;

    public Particular(String fechaNacimiento, String nombre, String apellido, boolean primerConsulta, Consulta consultaPaciente, double cobroConsulta, String dni) {
        super(fechaNacimiento, nombre, apellido, primerConsulta, consultaPaciente);
        this.cobroConsulta = cobroConsulta;
        this.dni = dni;
    }

    public double getCobroConsulta() {
        return cobroConsulta;
    }

    public void setCobroConsulta(double cobroConsulta) {
        this.cobroConsulta = cobroConsulta;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
