public abstract class Paciente {
    private Integer fechaNacimiento;
    private String nombre;
    private String apellido;
    private Boolean primeraConsulta;
    private Consulta consulta;

    public Paciente(Integer fechaNacimiento, String nombre, String apellido, Boolean primeraConsulta, Consulta consulta) {
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.primeraConsulta = primeraConsulta;
        this.consulta = consulta;
    };

    public Boolean necesitaEvaluacionInicial(){
        Boolean respuesta;
        if (getPrimeraConsulta()){
            respuesta=true;
        }else{
            respuesta=false;
        }
        return respuesta;
    };

    public Boolean getPrimeraConsulta() {
        return primeraConsulta;
    }
}
