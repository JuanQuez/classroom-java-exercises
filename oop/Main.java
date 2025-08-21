import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Estructure Programming
    System.out.println("Hello, World!");
    System.out.println("Write the first number: ");
    int num1 = sc.nextInt();
    sc.nextLine();

    System.out.println("Write the second number: ");
    int num2 = sc.nextInt();
    sc.nextLine();

    /*
     * int sum = num1 + num2;
     * System.out.println("The sum is: " + sum);
     * sc.close();
     */ 

    // OOP JAVA
    // Object instances
    AritmeticOperation op = new AritmeticOperation();
    op.num1 = num1;
    op.num2 = num2;
    op.sumOp();

    // Second instance
    AritmeticOperation op2 = new AritmeticOperation();
    op2.num1 = num1;
    op2.num2 = num2;
    op2.sumOp();


    // Person class instance
    Person personClient = new Person("John Doe", 30);
    personClient.ShowInformation();

    Person personEmployee = new Person("Jane Doe", 28);
    personEmployee.ShowInformation();

    sc.close();
  }
}
