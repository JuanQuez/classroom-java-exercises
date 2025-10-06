//* Package and code organization
package theme_map;

//* Abstract class and abstraction
public abstract class Recipe implements Describible { //*  Implements Describible interface
  // * Attributes
  protected String name;
  protected int prepTime; //! in minutes
  
  // * Constructor
  public Recipe(String name, int prepTime) {
    this.name = name;
    this.prepTime = prepTime;
  }

  // * Abstract method
  public abstract void showIngredients();

  // * toString, equals, and hashCode
  @Override
  public String toString() {
    return name + " (" + prepTime + " min)";
  }

  //* Two recipes are considered equal if they have the same name.
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Recipe))
      return false;
    Recipe other = (Recipe) obj;
    return name.equals(other.name);
  }

  //* Hash code based on name
  @Override
  public int hashCode() {
    return name.hashCode();
  }

}
