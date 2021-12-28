package Parcial;

import java.time.LocalDateTime;

public class Consulta {

    private String fechaConsulta;
    private String especialidad;
    private int horaConsulta;
    private int minutoConsulta;



    public Consulta(String fechaConsulta, String especialidad, int horaConsulta, int minutoConsulta) {
        this.fechaConsulta = fechaConsulta;
        this.especialidad = especialidad;
        this.horaConsulta = horaConsulta;
        this.minutoConsulta = minutoConsulta;
    }

    public String getFechaConsulta() {
        return fechaConsulta;
    }

    public void setFechaConsulta(String fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getHoraConsulta() {
        return horaConsulta;
    }

    public void setHoraConsulta(int horaConsulta) {
        this.horaConsulta = horaConsulta;
    }

    public int getMinutoConsulta() {
        return minutoConsulta;
    }

    public void setMinutoConsulta(int minutoConsulta) {
        this.minutoConsulta = minutoConsulta;
    }
}
