public class PSimple extends Pizzas {

    private double precioBase;
    private String tamanioPizza;


    @Override
    public double calcularPrecio() {
        if (tamanioPizza.equals("Grande")) {
            return precioBase*2;
        }
        return precioBase;
    }


    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getTamanioPizza() {
        return tamanioPizza;
    }

    public void setTamanioPizza(String tamanioPizza) {
        this.tamanioPizza = tamanioPizza;
    }
}
