public abstract class Pizzas {
    private String nombre;
    private String descripcion;
    public abstract double calcularPrecio();

    public String toString(){
        return "Pizza: " + nombre + " Precio: " + calcularPrecio();
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
