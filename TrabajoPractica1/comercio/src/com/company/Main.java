package com.company;

public class Main {

    public static void main(String[] args) {

       Persona persona = new Persona("Pedro", "Fei",12545, 25);

       ContratoMensual contratoMensual = new ContratoMensual(7,2021,true,persona,25484d,25,"JEFE");
       //metodo esJefe
        System.out.println(contratoMensual.esJefe());

       ContratoPorHora pedro = new ContratoPorHora(24,2021,true,persona,484,25487d);
       ContratoPorHora pablo= new ContratoPorHora(24,2021,true,persona,498,25487d);

       //Comparo contrato por hora de pedro y pablo, quien tiene mas cantidad de horas por mes,en este caso debe dar -1 por que pablo tiene mas horas que pedro
        System.out.println(pedro.compareTo(pablo));

        //metodo si el trabajador por hora pablo puede incorporarse al trabajo
        System.out.println(pedro.incorporarTrabajo());

     }
}
