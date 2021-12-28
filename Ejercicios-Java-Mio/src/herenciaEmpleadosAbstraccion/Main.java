package herenciaEmpleadosAbstraccion;

public class Main {
    public static void main(String[] args) {
        Comercial c1= new Comercial(100.0,"COMERCIAL UNO",1000.0,22);
        Repartidor r1= new Repartidor("zona 3","Juan",1000.0,22);

        c1.plus();
        r1.plus();

        System.out.println(c1);
        System.out.println(r1);
    }
}
