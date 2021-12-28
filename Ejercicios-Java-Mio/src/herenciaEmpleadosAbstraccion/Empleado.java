package herenciaEmpleadosAbstraccion;

public abstract class Empleado {
    private String nombre;
    private Double salario;
    private int edad;
    public final Double PLUS=302.0;


    public Empleado(String nombre, Double salario, int edad) {
        this.nombre = nombre;
        this.salario = salario;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean plus() {
        return false;
    }

    @Override
    public String toString() {
        return nombre=" + nombre" + "salario=" + salario + " edad=" + edad+", ";
    }
}
