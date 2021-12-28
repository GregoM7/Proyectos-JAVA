public class Consulta {
    private Integer fechaConsulta;
    private String especialidad;
    private Double horaDeConsulta;

    public Consulta(Integer fechaConsulta, String especialidad, Double horaDeConsulta) {
        this.fechaConsulta = fechaConsulta;
        this.especialidad = especialidad;
        this.horaDeConsulta = horaDeConsulta;
    }

    public Integer getFechaConsulta() {
        return fechaConsulta;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public Double getHoraDeConsulta() {
        return horaDeConsulta;
    }
}
