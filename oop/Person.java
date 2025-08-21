public class Person {
  // attributes
  private String name;
  private int age;

  // constructor
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // methods
  public void ShowInformation() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
  }
}
