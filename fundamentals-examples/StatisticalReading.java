import java.util.*;

public class StatisticalReading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: number of readings
        System.out.print("Enter the number of readings (N): ");
        int N = sc.nextInt();

        if (N <= 0) {
            System.out.println("There are no readings to process.");
            sc.close();
            return;
        }

        List<Double> readings = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            System.out.printf("Enter value #%d: ", i);
            readings.add(sc.nextDouble());
        }

        // Statistics
        double sum = 0, min = readings.get(0), max = readings.get(0);
        for (double value : readings) {
            sum += value;
            if (value < min)
                min = value;
            if (value > max)
                max = value;
        }
        double average = sum / N;

        // Output
        System.out.println("\n--- Readings summary ---");
        int idx = 1;
        for (double value : readings) {
            System.out.printf("%d. %.2f\n", idx++, value);
        }
        System.out.printf("Average: %.2f\n", average);
        System.out.printf("Minimum: %.2f\n", min);
        System.out.printf("Maximum: %.2f\n", max);

        sc.close();
    }
}
