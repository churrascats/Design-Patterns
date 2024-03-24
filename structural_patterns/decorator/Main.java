import decorators.CalabresaDecorator;
import decorators.CatupiryDecorator;
import decorators.FrangoDecorator;
import pizza.Pizza;
import pizza.VeggiePizza;

public class Main {

    public static void main(String[] args) {

        Pizza pizzaTopzera = new FrangoDecorator(
                new CalabresaDecorator(
                        new CatupiryDecorator(
                                new VeggiePizza())));

        System.err.println(pizzaTopzera.getPrice());
    }
}