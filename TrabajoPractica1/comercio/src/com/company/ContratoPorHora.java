package com.company;

import java.util.Objects;

public class ContratoPorHora extends Contrato implements Comparable{
    private Integer cantidadHorasPorMes;
    private Double valorHora;

    public ContratoPorHora(Integer mesesDuracion, Integer fechaInicio, Boolean sellado, Persona persona, Integer cantidadHorasPorMes, Double valorHora) {
        super(mesesDuracion, fechaInicio, sellado, persona);
        this.cantidadHorasPorMes = cantidadHorasPorMes;
        this.valorHora = valorHora;
    }


    @Override
    public int compareTo(Object o) {
        ContratoPorHora contratoPorHora = (ContratoPorHora) o;
        if(this.cantidadHorasPorMes > contratoPorHora.cantidadHorasPorMes ){
            return 1; //mayor
        }
        if(this.cantidadHorasPorMes < contratoPorHora.cantidadHorasPorMes ){
            return -1; //menor
        }
        return 0;//son iguales
    }
}
