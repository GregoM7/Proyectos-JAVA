package com.company;

public class ContratoMensual extends Contrato{
    private Double salarioMensual;
    private Integer horasTotales;
    private String cargo;

    public ContratoMensual(Integer mesesDuracion, Integer fechaInicio, Boolean sellado, Persona persona, Double salarioMensual, Integer horasTotales, String cargo) {
        super(mesesDuracion, fechaInicio, sellado, persona);
        this.salarioMensual = salarioMensual;
        this.horasTotales = horasTotales;
        this.cargo = cargo;
    }

    public Boolean esJefe(){
        if(this.cargo == "JEFE"){
            return true;
        }else{
            return false;
        }
    }
}
