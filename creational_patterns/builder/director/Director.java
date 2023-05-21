package director;

import java.util.Map;

import builders.Builder;

public class Director {

    public void buildPizza(String defaultRecipe, int size, Builder builder) {

        switch (defaultRecipe) {
            case "Bacon":
                baconPizza(size, builder);
                break;
            case "Chicken":
                chickenPizza(size, builder);
                break;
            case "Sausage":
                sausagePizza(size, builder);
                break;

            default:
                break;
        }
    }

    public void buildPizza(Map<String, Object> customRecipe, Builder builder){
        builder.setSize((int) customRecipe.get("size"));
        builder.setSauce((boolean) customRecipe.get("sauce"));
        builder.setCheese((boolean) customRecipe.get("cheese"));
        builder.setBacon((boolean) customRecipe.get("bacon"));
        builder.setChicken((boolean) customRecipe.get("chicken"));
        builder.setSausage((boolean) customRecipe.get("sausage"));  
    }

    public void baconPizza(int size, Builder builder){
        builder.setSize(size);
        builder.setSauce(true);
        builder.setCheese(true);
        builder.setBacon(true);
        builder.setChicken(false);
        builder.setSausage(false);
    }

    public void chickenPizza(int size, Builder builder){
        builder.setSize(size);
        builder.setSauce(true);
        builder.setCheese(true);
        builder.setBacon(false);
        builder.setChicken(true);
        builder.setSausage(false);
    }

    public void sausagePizza(int size, Builder builder){
        builder.setSize(size);
        builder.setSauce(true);
        builder.setCheese(true);
        builder.setBacon(false);
        builder.setChicken(false);
        builder.setSausage(true);
    }
}
