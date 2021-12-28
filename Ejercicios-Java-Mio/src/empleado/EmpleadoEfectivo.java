package empleado;

public class EmpleadoEfectivo extends Empleado {

    private int sueldo;
    private int antiguedad;

    public EmpleadoEfectivo(int dni, String nombre, String apellido, int sueldo, int antiguedad) {
        super(dni, nombre, apellido);   //se usa la palabra super para llamar al cosntructor padre
        this.sueldo = sueldo;
        this.antiguedad = antiguedad;
    }

    @Override
    public int calcularSueldo() {
        return (sueldo+antiguedad*1000);
    }
}
