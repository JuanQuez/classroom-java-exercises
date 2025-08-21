import java.util.Scanner;
import java.text.DecimalFormat;

public class WaterConsumption {
    public static void main(String[] args) {
        
        // Create Scanner for input
        Scanner sc = new Scanner(System.in);
        
        // Create formatter for numbers
        DecimalFormat formatter = new DecimalFormat("###,###.##");
        
        // Rate per liter
        double ratePerLiter = 0.15;
        
        System.out.println("=== WATER CONSUMPTION CALCULATOR ===");
        System.out.println();
        
        // 1. Capture user or household name
        System.out.print("Enter the user or household name: ");
        String name = sc.nextLine();
        
        // 2. Capture initial meter reading (in liters)
        System.out.print("Enter the initial reading of the month (in liters): ");
        double initialReading = sc.nextDouble();
        
        // 3. Capture final meter reading (in liters)
        System.out.print("Enter the final reading of the month (in liters): ");
        double finalReading = sc.nextDouble();
        
        // 4. Calculate total consumption in liters
        double totalConsumption = finalReading - initialReading;
        
        // 5. Calculate total cost (consumption × rate per liter)
        double totalCost = totalConsumption * ratePerLiter;
        
        // 6. Show summary of consumption and cost
        System.out.println();
        System.out.println("--- Consumption summary ---");
        System.out.println("User: " + name);
        System.out.println("Consumption: " + formatter.format(totalConsumption) + " liters");
        System.out.println("Total cost: $" + formatter.format(totalCost));
        
        // Additional information
        System.out.println();
        System.out.println("Calculation details:");
        System.out.println("Initial reading: " + formatter.format(initialReading) + " liters");
        System.out.println("Final reading: " + formatter.format(finalReading) + " liters");
        System.out.println("Rate per liter: $" + ratePerLiter);
        
        sc.close();
    }
}
