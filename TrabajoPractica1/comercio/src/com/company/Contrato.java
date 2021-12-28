package com.company;

public abstract  class Contrato {
    private Integer mesesDuracion;
    private Integer fechaInicio;
    private Boolean sellado;
    private Persona persona;

    public Contrato(Integer mesesDuracion, Integer fechaInicio, Boolean sellado, Persona persona) {
        this.mesesDuracion = mesesDuracion;
        this.fechaInicio = fechaInicio;
        this.sellado = sellado;
        this.persona = persona;
    }

    public Boolean incorporarTrabajo(){
               if(sellado){
                   return true;
               }else{
                   return false;
               }
    }
}
