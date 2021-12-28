package com.company;

public class PropiedadFactory {
 //Patron 1
    private static PropiedadFactory instance;

    //Patron 2
    private PropiedadFactory(){

    }
    //Patron 3
    public static PropiedadFactory getInstance() {
        if (instance == null) {
            instance = new PropiedadFactory();
        }
        return instance;
    }



    public Propiedad crearPropiedad(String nombrePropiedad){
        switch (nombrePropiedad){
            case "casa":
                return new Casa();

            case "barrioCerrado":
                return new BarrioCerrado();
            default:
                return null;
        }


    }


}


