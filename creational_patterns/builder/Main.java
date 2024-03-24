import java.util.Map;

import builders.PizzaBuilder;
import director.Director;
import product.Pizza;

public class Main {
    public static void main(String[] args){
        
        String defaultRecipe = null;
        int size = 10;
        
        Map<String, Object> customRecipe = Map.of(
            "size", size,
            "sauce", true,
            "cheese", true,
            "bacon", true,
            "chicken", true,
            "sausage", true
        );

        Director director = new Director();
        PizzaBuilder builder = new PizzaBuilder();
    
        //-----------------

        if(defaultRecipe != null){
            director.buildPizza(defaultRecipe, size, builder);
        }
        else{
            director.buildPizza(customRecipe, builder);
        }
        
        Pizza pizza = builder.build();

        //-----------------

        pizza.getPizzaRecipe();
    }
}
