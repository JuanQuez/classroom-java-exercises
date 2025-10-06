package theme_map;

//* Class with static factory method and static attribute
public class Utensil {
  private final String name;
  private static int counter = 0;
  String type = "kitchen"; // ! package-private

  // * Constructor
  public Utensil(String name) {
    this.name = name;
    counter++;
  }

  // * Getters
  public String getName() {
    return name;
  }

  public static int getCounter() {
    return counter;
  }

  public static Utensil createPressureCooker() {
    return new Utensil("Electric Pressure Cooker");
  }
}
