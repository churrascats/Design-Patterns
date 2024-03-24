package decorators;

import pizza.Pizza;

public class CatupiryDecorator extends PizzaDecorator {

    public CatupiryDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 8;
    }

}
