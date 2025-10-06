package theme_map;

public class Main {
  public static void main(String[] args) {
    Utensil cooker = Utensil.createPressureCooker();

    Recipe arrozConLeche = new PressureRecipe(
        "Healthy Arroz con Leche",
        25,
        new String[] { "Brown rice", "Almond milk", "Cinnamon", "Stevia" },
        cooker);

    Recipe recipe = arrozConLeche; //! Upcasting

    recipe.showIngredients(); //! Dynamic dispatch
    recipe.describe(); //! Uso del método default de la interfaz
    System.out.println(recipe); //! toString
    System.out.println("Is recipe registered? " + recipe.equals(arrozConLeche));
    System.out.println("Utensils created: " + Utensil.getCounter());
  }
}
