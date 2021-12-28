package herenciaEmpleadosAbstraccion;

public class Repartidor extends Empleado{
    private String zona;

    public Repartidor(String zona, String nombre, Double salario, int edad) {
        super(nombre, salario, edad);
        this.zona=zona;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public String toString() {
        return super.toString()+" zona='" + zona;
    }

    @Override
    public boolean plus() {
        if (getEdad()<25 && zona.equalsIgnoreCase("zona 3")){
            Double nuevoSalario= getSalario()+PLUS;
            setSalario(nuevoSalario);
            System.out.println("Se ha añadido el plus al empleado "+getNombre());
            return true;
        }
        return false;
    }
}
