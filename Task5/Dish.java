package Task5;
import java.util.HashMap;

public class Dish {
    private final String name;
    private final double price;
    private final HashMap<String, Integer> requiredIngredients;

    public Dish(String name, double price, HashMap<String, Integer> requiredIngredients) {
        this.name = name;
        this.price = price;
        this.requiredIngredients = requiredIngredients;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public HashMap<String, Integer> getRequiredIngredients() {
        return requiredIngredients;
    }

    @Override
    public String toString() {
        return name + " - " + price + " грн";
    }
}
