package Task5;
import java.util.Collection;
import java.util.TreeMap;

public class Menu {
    private final TreeMap<String, Dish> dishes = new TreeMap<>();

    public void addDish(Dish dish) {
        dishes.put(dish.getName(), dish);
    }

    public Dish getDish(String name) {
        return dishes.get(name);
    }

    public Collection<Dish> getAllDishes() {
        return dishes.values();
    }
}
