package com.company;

public class Main {

    public static void main(String[] args) {

        Barco barco = new Barco();

        Carga carga1 =  CargaFactory.getInstance().crearCarga("Carga simple");
        Carga carga2 =  CargaFactory.getInstance().crearCarga("Carga simple");
        Carga contenedor =  CargaFactory.getInstance().crearCarga("Contenedor");


        //constructor
        carga1.setNombre("TV 32’ LCD");
        carga1.setDescripcion("aaa");
        ((CargaSimple)carga1).setPesoCarga(3d);
        ((CargaSimple)carga1).setRefigeracion(false);

        //constructor
        carga2.setNombre("caja de medicamentos");
        carga1.setDescripcion("bb");
        ((CargaSimple)carga2).setPesoCarga(2d);
        ((CargaSimple)carga2).setRefigeracion(true);

        ((Contenedor)contenedor).setPesoContenedor(100d);
        ((Contenedor)contenedor).agregarCarga(carga1);
        ((Contenedor)contenedor).agregarCarga(carga2);


        barco.agregarCarga(carga1);
        barco.agregarCarga(carga2);
        barco.agregarCarga(contenedor);
        barco.mostrarCargar();




    }
}
