package Clase10;

public class SocioHabilitado extends Socio {
    private Double costoPileta;
    private boolean habilitado;


    public SocioHabilitado (String numero, String nombre, String actividad, Double cuota, Double costoIngreso) {
        super(numero, nombre, actividad, cuota);
        costoPileta= costoIngreso;
    }
    @Override
    public Double costoMensual() {
        if (habilitado ) {
            return costoPileta+getCuotaMensual();
        } else {
            return getCuotaMensual();
        }
    }
    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }
}
