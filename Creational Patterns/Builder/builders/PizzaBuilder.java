package builders;

import product.Pizza;

public class PizzaBuilder implements Builder {

    private int size;
    private boolean sauce;
    private boolean cheese;
    private boolean bacon;
    private boolean chicken;
    private boolean sausage;

    @Override
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void setSauce(boolean sauce) {
        this.sauce = sauce;
    }

    @Override
    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    @Override
    public void setBacon(boolean bacon) {
        this.bacon = bacon;
    }

    @Override
    public void setChicken(boolean chicken) {
        this.chicken = chicken;
    }

    @Override
    public void setSausage(boolean sausage) {
        this.sausage = sausage;
    }

    public Pizza build(){
        return new Pizza(size, sauce, cheese, bacon, chicken, sausage);
    }
}
