public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Gregorio","Martinez",40320878,24);
        Persona persona2 = new Persona("Bautista","Martinez",45211349,18);
        Persona persona3 = new Persona("Favio","Martinez",18444028,53);
        Persona persona4 = new Persona("Mercedes","Valsangiacomo",24704028,43);
        SaldoXHora Gregorio = new SaldoXHora(12,6,false,persona1,40,155.00);
        SaldoXHora Mercedes = new SaldoXHora(24,16,true,persona4,34,180.00);
        SaldoXMes Bautista = new SaldoXMes(36,10,true,persona2,15000.00,50,"SUPERVISOR");
        SaldoXMes Favio = new SaldoXMes(60,2, true,persona3,30000.00,43,"JEFE");

        System.out.println("Comparacion");
        System.out.println(Gregorio.compareTo(Mercedes));

        System.out.println("Se puede incorporar al Trabajo Gregorio?");
        System.out.println(Gregorio.incorporarseAlTrabajo());

        System.out.println("Se puede incorporar al Trabajo Mercedes?");
        System.out.println(Mercedes.incorporarseAlTrabajo());

        System.out.println("Bautista es Jefe?");
        System.out.println(Bautista.EsJefe());

        System.out.println("Favio es Jefe?");
        System.out.println(Favio.EsJefe());
    }

}
