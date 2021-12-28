package com.company;

import java.util.ArrayList;
import java.util.List;

public class BarrioCerrado extends Propiedad{

    private Integer factorMultiplicador;
    private List<Propiedad> propiedades = new ArrayList<>();



    public void agregarPropieda(Propiedad propiedad){
        propiedades.add(propiedad);
    }


    @Override
    public Double calcularImpuesto() {
        Double precioTotal= 0.0;
        for (Propiedad propiedade : propiedades) {
            precioTotal += propiedade.calcularImpuesto();
        }
        return precioTotal * factorMultiplicador;
    }


    public Integer getFactorMultiplicador() {
        return factorMultiplicador;
    }

    public void setFactorMultiplicador(Integer factorMultiplicador) {
        this.factorMultiplicador = factorMultiplicador;
    }

    public List<Propiedad> getPropiedades() {
        return propiedades;
    }

    public void setPropiedades(List<Propiedad> propiedades) {
        this.propiedades = propiedades;
    }
}
