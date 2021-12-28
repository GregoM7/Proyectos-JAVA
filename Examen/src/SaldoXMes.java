public class SaldoXMes extends Contrato{
    private double salarioMensual;
    private int horasTotales;
    private String cargo;

    public SaldoXMes(int cantidadMeses, Integer fechaInicioActividad, boolean selladoXMinisterio, Persona persona, double salarioMensual, int horasTotales, String cargo) {
        super(cantidadMeses, fechaInicioActividad, selladoXMinisterio, persona);
        this.salarioMensual = salarioMensual;
        this.horasTotales = horasTotales;
        this.cargo = cargo;
    }

    public boolean EsJefe(){
        Boolean respuesta;
        if(cargo == "JEFE" || cargo == "jefe"){
            respuesta = true;
        } else  {
            respuesta = false;
        }
        return respuesta;
    }
}
