package com.company;

import java.util.ArrayList;
import java.util.List;

public class Barco {
 private Double pesoContenedor;
    private List<Carga> cargas = new ArrayList<>();

    public void agregarCarga(Carga carga){
        cargas.add(carga);
    }

    public void mostrarCargar(){
        for (Carga carga : cargas) {
            System.out.println(carga);
        }
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
