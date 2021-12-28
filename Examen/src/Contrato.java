public abstract class Contrato {
    private int cantidadMeses;
    private Integer fechaInicioActividad;
    private boolean selladoXMinisterio;
    private Persona persona;

    public Contrato(int cantidadMeses, Integer fechaInicioActividad, boolean selladoXMinisterio, Persona persona) {
        this.cantidadMeses = cantidadMeses;
        this.fechaInicioActividad = fechaInicioActividad;
        this.selladoXMinisterio = selladoXMinisterio;
        this.persona = persona;
    }

    public Boolean incorporarseAlTrabajo(){
        Boolean respuesta;
        if (getSelladoXMinisterio()){
            respuesta=true;
        }else{
            respuesta=false;
        }
        return respuesta;
    };

    public int getCantidadMeses() {
        return cantidadMeses;
    }

    public void setCantidadMeses(int cantidadMeses) {
        this.cantidadMeses = cantidadMeses;
    }

    public Integer getFechaInicioActividad() {
        return fechaInicioActividad;
    }

    public void setFechaInicioActividad(Integer fechaInicioActividad) {
        this.fechaInicioActividad = fechaInicioActividad;
    }

    public boolean getSelladoXMinisterio() {
        return selladoXMinisterio;
    }

    public void setSelladoXMinisterio(boolean selladoXMinisterio) {
        this.selladoXMinisterio = selladoXMinisterio;
    }
}
