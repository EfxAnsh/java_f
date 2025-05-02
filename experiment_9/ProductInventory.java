package experiment_9;

import java.util.HashMap;
import java.util.Map;

public class ProductInventory {
    public static void main(String[] args) {
        HashMap<Integer, Integer> inventory = new HashMap<>();
        inventory.put(1001, 50);
        inventory.put(1002, 30);
        inventory.put(1003, 70);

        // Update quantity of product 1002
        inventory.put(1002, 45);

        // Remove product 1001
        inventory.remove(1001);

        // Display final inventory
        for (Map.Entry<Integer, Integer> entry : inventory.entrySet()) {
            System.out.println("Product ID: " + entry.getKey() + ", Quantity: " + entry.getValue());
        }
    }
}
