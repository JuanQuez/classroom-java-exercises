package theme_map;

//* Preferimos composición cuando queremos reutilizar funcionalidades sin heredar toda la estructura de la clase base.
//* Por ejemplo, PressureRecipe tiene un Utensil (composición), en vez de heredar de Utensil.
//* Usamos herencia cuando hay una relación "es-un", como PressureRecipe es una Recipe.
public class PressureRecipe extends Recipe {
    private final String[] ingredients;
    private final Utensil utensil;

    //* Invariante: los ingredientes no pueden ser nulos ni vacíos
    public PressureRecipe(String name, int prepTime, String[] ingredients, Utensil utensil) {
        super(name, prepTime);
        if (ingredients == null || ingredients.length == 0) {
            throw new IllegalArgumentException("Ingredients must not be null or empty");
        }
        this.ingredients = ingredients;
        this.utensil = utensil;
    }

    //* Sobrecarga de constructor: receta sin utensilio
    public PressureRecipe(String name, int prepTime, String[] ingredients) {
        this(name, prepTime, ingredients, null);
    }

    @Override
    public void showIngredients() {
        System.out.println("Ingredients for " + name + ":");
        for (String ing : ingredients) {
            System.out.println("- " + ing);
        }
        if (utensil != null) {
            System.out.println("Use: " + utensil.getName());
        } else {
            System.out.println("No specific utensil required.");
        }
    }

    //* Getters
    public String[] getIngredients() {
        return ingredients;
    }

    public Utensil getUtensil() {
        return utensil;
    }
}
