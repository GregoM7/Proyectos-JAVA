package com.company;

public abstract class Propiedad {
    private String calle;
    private Integer numero;



    public abstract Double calcularImpuesto();

    @Override
    public String toString() {
        return "Su calle es " + calle + " numero " + numero + " y debe pagar de impuesto : "+ calcularImpuesto();

    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
}
