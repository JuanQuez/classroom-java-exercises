
public class WherehouseWc {
    public static void main(String[] args) {

        // STEP 1: Define initial prices
        double shoes = 350000;
        double sneakers = 280000;
        double tShirts = 175000;
        double jeans = 200000;

        // STEP 2: Show warehouse and initial prices
        System.out.println("=== WHEREHOUSE WC ===");
        System.out.println();
        System.out.println("ITEMS AND CURRENT PRICES:");
        System.out.println("Shoes: $" + shoes);
        System.out.println("Sneakers: $" + sneakers);
        System.out.println("T-Shirts: $" + tShirts);
        System.out.println("Jeans: $" + jeans);

        // STEP 3: Calculate total cost
        double total = shoes + sneakers + tShirts + jeans;
        System.out.println();
        System.out.println("Total cost of the four items: $" + total);

        // STEP 4: Calculate average
        double average = total / 4;
        System.out.println("Average price: $" + average);

        // STEP 5: Increase the price of Jeans by 6.2%
        jeans = jeans + (jeans * 0.062);
        System.out.println();
        System.out.println("Increase the price of Jeans by 6.2%");
        System.out.println("New price Jeans: $" + jeans);

        // STEP 6: Decrease the price of Shoes by 0.8%
        shoes = shoes - (shoes * 0.008);
        System.out.println();
        System.out.println("Decrease the price of Shoes by 0.8%");
        System.out.println("New price Shoes: $" + shoes);

        // STEP 7: Show all final prices
        System.out.println();
        System.out.println("=== FINAL PRICES ===");
        System.out.println("Price of Shoes: $" + shoes);
        System.out.println("Price of Sneakers: $" + sneakers);
        System.out.println("Price of T-Shirts: $" + tShirts);
        System.out.println("Price of Jeans: $" + jeans);

        // STEP 8: Calculate new total and average
        double newTotal = shoes + sneakers + tShirts + jeans;
        double newAverage = newTotal / 4;

        System.out.println();
        System.out.println("Total: $" + newTotal);
        System.out.println("Average Price: $" + newAverage);
    }
}
