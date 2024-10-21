package Task5;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class RestaurantManagementSystem {
    private final Menu menu = new Menu();
    private final LinkedList<Order> orders = new LinkedList<>();
    private final HashMap<String, Ingredient> stock = new HashMap<>();
    private final LinkedList<Reservation> reservations = new LinkedList<>();

    public void addDishToMenu(String name, double price, HashMap<String, Integer> requiredIngredients) {
        menu.addDish(new Dish(name, price, requiredIngredients));
    }

    public void placeOrder(String dishName) {
        Dish dish = menu.getDish(dishName);
        if (dish != null) {
            if (checkIngredientsForDish(dish)) {
                Order order = new Order();
                order.addDish(dish);
                orders.add(order);
                System.out.println("Замовлення додано: " + dishName);
                useIngredientsForDish(dish);
            } else {
                System.out.println("Недостатньо інгредієнтів для страви: " + dishName);
            }
        } else {
            System.out.println("Страва не знайдена у меню.");
        }
    }

    private boolean checkIngredientsForDish(@NotNull Dish dish) {
        HashMap<String, Integer> requiredIngredients = dish.getRequiredIngredients();
        for (Map.Entry<String, Integer> entry : requiredIngredients.entrySet()) {
            String ingredientName = entry.getKey();
            int requiredAmount = entry.getValue();

            Ingredient stockIngredient = stock.get(ingredientName);
            if (stockIngredient == null || stockIngredient.getQuantity() < requiredAmount) {
                return false;
            }
        }
        return true;
    }

    private void useIngredientsForDish(@NotNull Dish dish) {
        HashMap<String, Integer> requiredIngredients = dish.getRequiredIngredients();
        for (Map.Entry<String, Integer> entry : requiredIngredients.entrySet()) {
            String ingredientName = entry.getKey();
            int requiredAmount = entry.getValue();

            Ingredient stockIngredient = stock.get(ingredientName);
            if (stockIngredient != null) {
                stockIngredient.use(requiredAmount);
                System.out.println("Використано інгредієнт: " + ingredientName + ", залишилось: " + stockIngredient.getQuantity());
            }
        }
    }

    public void printOrderDetails(@NotNull Order order) {
        System.out.println("Деталі замовлення:");
        for (Dish dish : order.getDishes()) {
            System.out.println(dish);
        }
        System.out.println("Загальна сума: " + order.getTotal() + " грн");
    }

    public void addIngredientToStock(String name, int quantity) {
        stock.put(name, new Ingredient(name, quantity));
    }

    public void makeReservation(String customerName, Date date) {
        reservations.add(new Reservation(customerName, date));
        System.out.println("Резервацію зроблено для " + customerName);
    }

    // Новий метод для виведення деталей конкретної резервації
    public void printReservationDetails(@NotNull Reservation reservation) {
        System.out.println("Резервація для: " + reservation.getCustomerName());
        System.out.println("Дата резервації: " + reservation.getReservationDate());
    }

    public void printMenu() {
        System.out.println("Меню ресторану:");
        for (Dish dish : menu.getAllDishes()) {
            System.out.println(dish);
        }
    }

    public void printReservations() {
        System.out.println("Резервації:");
        for (Reservation res : reservations) {
            System.out.println(res.getCustomerName() + " - " + res.getReservationDate());
        }
    }

    public void printStock() {
        System.out.println("Запаси:");
        for (Ingredient ingredient : stock.values()) {
            System.out.println(ingredient);
        }
    }

    public Order getLastOrder() {
        if (!orders.isEmpty()) {
            return orders.getLast();
        } else {
            System.out.println("Немає замовлень.");
            return null;
        }
    }

    public Reservation getLastReservation() {
        return reservations.getLast();
    }
}
