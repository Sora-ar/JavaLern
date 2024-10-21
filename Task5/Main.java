package Task5;
import org.jetbrains.annotations.NotNull;

import java.util.Date;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        RestaurantManagementSystem system = getRestaurantManagementSystem();
        system.printStock();

        system.placeOrder("Борщ");

        system.makeReservation("Олексій", new Date());
        system.placeOrder("Борщ");
        system.placeOrder("Вареники");

        Order lastOrder = system.getLastOrder();
        if (lastOrder != null) {
            system.printOrderDetails(lastOrder);
        }

        Reservation lastReservation = system.getLastReservation();
        system.printReservationDetails(lastReservation);

        system.printReservations();
        system.printStock();
    }

    private static @NotNull RestaurantManagementSystem getRestaurantManagementSystem() {
        RestaurantManagementSystem system = new RestaurantManagementSystem();
        HashMap<String, Integer> borschtIngredients = new HashMap<>();
        borschtIngredients.put("Картопля", 2);
        borschtIngredients.put("Буряк", 1);

        HashMap<String, Integer> varenikiIngredients = new HashMap<>();
        varenikiIngredients.put("Картопля", 3);

        system.addDishToMenu("Борщ", 80, borschtIngredients);
        system.addDishToMenu("Вареники", 60, varenikiIngredients);


        system.addIngredientToStock("Картопля", 100);
        system.addIngredientToStock("Буряк", 50);

        system.printMenu();
        return system;
    }
}
