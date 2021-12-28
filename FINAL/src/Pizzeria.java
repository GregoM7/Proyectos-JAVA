import java.util.ArrayList;
import java.util.List;

public class Pizzeria {
    private String nombre;
    private List<Pizzas> pizzasDisponibles;

    public Pizzeria(String nombre) {
        this.nombre = nombre;
        this.pizzasDisponibles = new ArrayList<>();
    }

    public void mostrarPizzas(){
        for (Pizzas pizzaDisponible : pizzasDisponibles) {
            System.out.println(pizzaDisponible.toString());
        }
    }

    public void agregarPizza(Pizzas pizza){
        this.pizzasDisponibles.add(pizza);
    }
}

