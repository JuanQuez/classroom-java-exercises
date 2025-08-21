import java.util.*;

public class SimpleInventory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> inventory = new HashMap<>();

        System.out.print("Enter the number of products (M): ");
        int M = sc.nextInt();
        sc.nextLine(); // Clear line break

        if (M <= 0) {
            System.out.println("There are no products to process.");
            sc.close();
            return;
        }

        for (int i = 1; i <= M; i++) {
            System.out.printf("Product #%d - Name: ", i);
            String name = sc.nextLine().trim();
            if (name.isEmpty()) {
                System.out.println("The name cannot be empty. Try again.");
                i--; // Repeat this loop
                continue;
            }
            System.out.printf("Product #%d - Stock: ", i);
            int stock = sc.nextInt();
            sc.nextLine(); // Clear line break
            inventory.put(name, stock);
        }

        // Show inventory
        System.out.println("\n--- Inventory ---");
        int totalUnits = 0;
        String maxProduct = null;
        int maxStock = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.printf("%s: %d units\n", entry.getKey(), entry.getValue());
            totalUnits += entry.getValue();
            if (entry.getValue() > maxStock) {
                maxStock = entry.getValue();
                maxProduct = entry.getKey();
            }
        }
        System.out.printf("Total units: %d\n", totalUnits);
        if (maxProduct != null) {
            System.out.printf("Product with the highest stock: %s (%d units)\n", maxProduct, maxStock);
        }
        sc.close();
    }
}
