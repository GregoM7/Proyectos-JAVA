import java.util.List;

public class PizzasFactory {
    private static PizzasFactory instancia;
    private List<Pizzas> pizzas;

    private PizzasFactory(){

    }
    public static PizzasFactory getInstancia(){
        if (instancia==null){
            instancia= new PizzasFactory();
        }
        return instancia;
    }

    public Pizzas crearPizza(String tipo){
        switch (tipo){
            case "Simple":
                return new PSimple();
            case "Combinada":
                return new PCombinadas();
            default:
                return null;
        }
    }
}
