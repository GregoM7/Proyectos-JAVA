package com.company;

public class Casa extends Propiedad {

    private Double montoImpuesto;



    @Override
    public Double calcularImpuesto() {

        if(getCalle().equals("Av. San Martin")){
            return montoImpuesto + (montoImpuesto*0.1);
        }
        return montoImpuesto;
    }

    public Double getMontoImpuesto() {
        return montoImpuesto;
    }

    public void setMontoImpuesto(Double montoImpuesto) {
        this.montoImpuesto = montoImpuesto;
    }
}
