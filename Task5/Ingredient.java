package Task5;

public class Ingredient {
    private final String name;
    private int quantity;

    public Ingredient(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void use(int amount) {
        this.quantity -= amount;
    }

    @Override
    public String toString() {
        return name + ": " + quantity + " одиниць";
    }
}

