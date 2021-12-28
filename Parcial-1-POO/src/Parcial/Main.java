package Parcial;

public class Main {

     public static void main(String[] args) {

        Consulta cons1= new Consulta("23/11/2022","cardiologo",15, 30);
        ObraSocial obra1=new ObraSocial("15/4/1999", "Carlos", "Perez", true, cons1,"federada", 45);
        Consulta cons2=new Consulta("24/5/2022", "gastroenterologo", 16, 45);
        ObraSocial obra2= new ObraSocial("12/3/1989", "Juan", "Garcia", false, cons2, "ioma", 33);
        Particular part1=new Particular("11/10/1985", "Roberto","Ramirez", true, new Consulta("15/3/2021", "clinico", 17, 30), 1685.33,"35124951");
         System.out.println("comparacion de obra1 con obra2 (45,33)");
        System.out.println(obra1.compareTo(obra2));
         System.out.println("evaluacion inicial de part1 (true)");
         System.out.println(part1.evaluacionInicial());
    }

}
