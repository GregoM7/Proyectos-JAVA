public class SaldoXHora extends Contrato implements Comparable {
    private int cantidadHorasXMes;
    private double valorXHora;

    public SaldoXHora(int cantidadMeses, Integer fechaInicioActividad, boolean selladoXMinisterio, Persona persona, int cantidadHorasXMes, double valorXHora) {
        super(cantidadMeses, fechaInicioActividad, selladoXMinisterio, persona);
        this.cantidadHorasXMes = cantidadHorasXMes;
        this.valorXHora = valorXHora;
    }

    @Override
    public int compareTo(Object o) {
        SaldoXHora contratoSXH = (SaldoXHora)o;
        int resp=0;
        if (this.cantidadHorasXMes > contratoSXH.cantidadHorasXMes){
            resp=1;
        }
        if(this.cantidadHorasXMes < contratoSXH.cantidadHorasXMes){
            resp=-1;
        }
        return resp;
    }
}
