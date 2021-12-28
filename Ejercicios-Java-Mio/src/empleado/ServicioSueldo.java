package empleado;

public class ServicioSueldo {
    public static void main(String[] args) {
        Empleado emp1= new EmpleadoEfectivo(12321,"homero","simpson",1000,2);
        Empleado emp2= new EmpleadoJornada(1213,"Lisa","Simpson",100,400);
        System.out.println("Calculamos sueldo de homero "+ emp1.calcularSueldo());
        System.out.println("Calculamos sueldo de Lisa "+ emp2.calcularSueldo());
    }
}
