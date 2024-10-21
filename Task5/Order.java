package Task5;
import java.util.LinkedList;

public class Order {
    private final LinkedList<Dish> dishes = new LinkedList<>();

    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    public LinkedList<Dish> getDishes() {
        return dishes;
    }

    public double getTotal() {
        double total = 0;
        for (Dish dish : dishes) {
            total += dish.getPrice();
        }
        return total;
    }
}
