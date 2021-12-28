package com.company;

public class CargaSimple extends Carga{

    private Double pesoCarga;
    private Boolean refigeracion;

    @Override
    public Double calcularPeso() {
        if(refigeracion){
            return pesoCarga + (pesoCarga*0.1);
        }
        return  pesoCarga;
    }

    public Double getPesoCarga() {
        return pesoCarga;
    }

    public void setPesoCarga(Double pesoCarga) {
        this.pesoCarga = pesoCarga;
    }

    public Boolean getRefigeracion() {
        return refigeracion;
    }

    public void setRefigeracion(Boolean refigeracion) {
        this.refigeracion = refigeracion;
    }
}
