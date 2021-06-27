package product;

public class Pizza {
    private final int size;
    private final boolean sauce;
    private final boolean cheese;
    private final boolean bacon;
    private final boolean chicken;
    private final boolean sausage;

    public Pizza(int size, boolean sauce, boolean cheese, boolean bacon, boolean chicken, boolean sausage) {
        this.size = size;
        this.sauce = sauce;
        this.cheese = cheese;
        this.bacon = bacon;
        this.chicken = chicken;
        this.sausage = sausage;
    }

    public void getPizzaRecipe(){
        String result = "This pizza has: \n";

        result += "Size = " + size + "\n";
        result += sauce ? "Sauce\n" : "";
        result += cheese ? "Cheese\n" : "";
        result += bacon ? "Bacon\n" : "";
        result += chicken ? "Chicken\n" : "";
        result += sausage ? "Sausage\n" : "";

        System.out.println(result);
    }
}
