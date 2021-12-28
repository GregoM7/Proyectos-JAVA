import java.util.ArrayList;
import java.util.List;

public class PCombinadas extends Pizzas {
private List<Pizzas> listapizzas = new ArrayList<>();

    @Override
    public double calcularPrecio() {
        double preciofinal= 0;
        for (Pizzas listapizza : listapizzas) {
            preciofinal += listapizza.calcularPrecio()/listapizzas.toArray().length;
        }
        return preciofinal;
    }
    public void agregarPizza(Pizzas pizza){
        this.listapizzas.add(pizza);
    }
}
