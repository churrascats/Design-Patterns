package decorators;

import pizza.Pizza;

public class CalabresaDecorator extends PizzaDecorator {

    public CalabresaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 15;
    }

}
