package com.company;

import java.util.ArrayList;
import java.util.List;

public class Municipio {
    private List<Propiedad> propiedades = new ArrayList<>();



    public void agregarPropieda(Propiedad nombre){
        propiedades.add(nombre);
    }

    public void mostrarPropiedad(){
        for (Propiedad propiedade : propiedades) {
            System.out.println(propiedade);
        }
    }

}
