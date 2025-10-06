package theme_map;

//* */ Interfaz with default method.
public interface Describible {
    default void describe() {
        System.out.println("This recipe is delicious and easy to make."); //? Show a default description.
    }
}