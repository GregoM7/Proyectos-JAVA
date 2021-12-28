public class Main {
    public static void main(String[] args) {
        Pizzeria pizzeria = new Pizzeria("Pizza Loca");
        Pizzas muzza= PizzasFactory.getInstancia().crearPizza("Simple");
        Pizzas especial= PizzasFactory.getInstancia().crearPizza("Simple");
        Pizzas anana= PizzasFactory.getInstancia().crearPizza("Simple");
        Pizzas pizzaLocaCombinada= PizzasFactory.getInstancia().crearPizza("Combinada");

        // Muzzarella
        muzza.setNombre("Muzarella");
        muzza.setDescripcion("Muzzarella Chica");
        ((PSimple)muzza).setTamanioPizza("Chica");
        ((PSimple)muzza).setPrecioBase(700);

        // Especial
        especial.setNombre("Especial");
        especial.setDescripcion("Especial Chica");
        ((PSimple)especial).setTamanioPizza("Chica");
        ((PSimple)especial).setPrecioBase(850);

        // Anana
        anana.setNombre("Anana");
        anana.setDescripcion("Anana Chica");
        ((PSimple)anana).setTamanioPizza("Chica");
        ((PSimple)anana).setPrecioBase(950);
        // Pizza Loca Combinada
        pizzaLocaCombinada.setNombre("Pizza Loca Combinada");
        pizzaLocaCombinada.setDescripcion("Pizza combinada especial y anana");
        ((PCombinadas)pizzaLocaCombinada).agregarPizza(especial);
        ((PCombinadas)pizzaLocaCombinada).agregarPizza(anana);

        // Agregando Pizzas a la Pizzeria
        pizzeria.agregarPizza(muzza);
        pizzeria.agregarPizza(especial);
        pizzeria.agregarPizza(anana);
        pizzeria.agregarPizza(pizzaLocaCombinada);
        // Mostrando las pizzas y el precio
        pizzeria.mostrarPizzas();
    }

}
