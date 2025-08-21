import java.util.Scanner;

public class CategoryTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inputs
        System.out.print("Enter the category: ");
        String category = sc.nextLine().toLowerCase();

        System.out.print("Enter the base price: ");
        double basePrice = sc.nextDouble();

        double taxRate;
        switch (category) {
            case "food":
                taxRate = 0.08;
                break;
            case "technology":
                taxRate = 0.19;
                break;
            case "clothing":
                taxRate = 0.12;
                break;
            default:
                taxRate = -1;
                break;
        }

        if (taxRate == -1) {
            System.out.println("Invalid category. Try: food, technology or clothing.");
        } else {
            double tax = basePrice * taxRate;
            double total = basePrice + tax;
            System.out.println("Subtotal: $" + basePrice);
            System.out.println("Tax (" + (taxRate * 100) + "%): $" + tax);
            System.out.println("Total: $" + total);
        }

        sc.close();
    }
}