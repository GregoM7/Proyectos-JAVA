package Clase10;

public class Main {
    public static void main(String[] args) {
        Socio s1 = new Socio("A001", "Gregorio","Basquet",2300.00);
        SocioHabilitado s2 = new SocioHabilitado("A002","Bautista","Voley",2300.00,1000.0);
        System.out.println("Cuota socio Gregorio: "+ s1.costoMensual());
        System.out.println("Cuota socio Bautista: "+ s2.costoMensual());
    }
}
