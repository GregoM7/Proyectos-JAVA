package com.company;

import java.util.ArrayList;
import java.util.List;

public class Contenedor extends Carga {
    private Double pesoContenedor;
    private List<Carga> cargas = new ArrayList<>();


    @Override
    public Double calcularPeso() {
        Double pesoTotal = 0.0;
        for (Carga carga : cargas) {
            pesoTotal += carga.calcularPeso();
        }
        return pesoTotal + pesoContenedor;
    }


    public void agregarCarga(Carga carga){
        cargas.add(carga);
    }

    public Double getPesoContenedor() {
        return pesoContenedor;
    }

    public void setPesoContenedor(Double pesoContenedor) {
        this.pesoContenedor = pesoContenedor;
    }

    public List<Carga> getCargas() {
        return cargas;
    }

    public void setCargas(List<Carga> cargas) {
        this.cargas = cargas;
    }
}
