package herenciaEmpleadosAbstraccion;

public class Comercial extends Empleado{
    private Double comision;


    public Comercial(Double comision,String nombre, Double salario, int edad) {
        super(nombre, salario, edad);
        this.comision=comision;
    }

    @Override
    public boolean plus() {
        if (getEdad()>30 && comision>200){
            Double nuevoSalario=getSalario()+PLUS;
            setSalario(nuevoSalario);
            System.out.println("Se añadio el plus a "+ getNombre());
            return true;
        }
        return false;
    }

    public Double getComision() {
        return comision;
    }

    public void setComision(Double comision) {
        this.comision = comision;
    }

    @Override
    public String toString() {
        return super.toString()+" comision=" + comision;
    }
}
