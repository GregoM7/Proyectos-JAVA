package com.company;

public class Main {

    public static void main(String[] args) {
        //
       Municipio municipio = new Municipio();


       //Creo la propiedades que me piden en este caso 2
       Propiedad propiedad1 = PropiedadFactory.getInstance().crearPropiedad("casa");
       Propiedad propiedad2 = PropiedadFactory.getInstance().crearPropiedad("casa");
       //Creo el barrio cerrado composite
       Propiedad barrioCerrado = PropiedadFactory.getInstance().crearPropiedad("barrioCerrado");


       //Seteo uno por uno los atributos
       propiedad1.setCalle("Av. San Martín");
       propiedad1.setNumero(130);

        //Casteo casa para obtener los atributos del mismo
        ((Casa)propiedad1).setMontoImpuesto(550d);

        //Seteo uno por uno los atributos de la otra casa
        propiedad2.setCalle("Mitre");
       propiedad2.setNumero(233);
        //Casteo casa para obtener los atributos del mismo
        ((Casa)propiedad2).setMontoImpuesto(700d);

        //Seteo uno por uno los atributos barrio cerrado
        barrioCerrado.setNumero(330);
       barrioCerrado.setCalle("Gutierres");

       //Casteo barrio cerrado para obtener los atributos del mismo
       ((BarrioCerrado)barrioCerrado).setFactorMultiplicador(2);
        ((BarrioCerrado)barrioCerrado).agregarPropieda(propiedad1);
        ((BarrioCerrado)barrioCerrado).agregarPropieda(propiedad2);

   //Agrego las propiedad al barrio cerrado que es el composite para obtener la sumatoria de todos los impuestos
      municipio.agregarPropieda(barrioCerrado);
      municipio.agregarPropieda(propiedad1);
      municipio.agregarPropieda(propiedad2);
      municipio.mostrarPropiedad();





    }
}
