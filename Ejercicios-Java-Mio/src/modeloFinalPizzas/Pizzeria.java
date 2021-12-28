package modeloFinalPizzas;

import java.util.ArrayList;
import java.util.List;

public class Pizzeria {
    private String nombre;
    private List<Pizza> pizzas;

    public Pizzeria(String nombre) {
        this.nombre = nombre;
        this.pizzas =new ArrayList<>();
    }

    public void MostrarPizzas(){
        for (Pizza pi: pizzas){
            System.out.println(pi.toString()
            );
        }
    }

    public void agregarPizzas(Pizza pi){
        this.pizzas.add(pi);
    }
}
