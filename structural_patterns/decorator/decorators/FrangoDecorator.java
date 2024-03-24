package decorators;

import pizza.Pizza;

public class FrangoDecorator extends PizzaDecorator {

    public FrangoDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 10;
    }

}
