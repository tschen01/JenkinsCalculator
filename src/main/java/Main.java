import java.util.Scanner;
public class Main {

  public static  void main(String[] args){
    Calculator calculator = new Calculator();

    Scanner scanner = new Scanner(System.in);  // Create a Scanner object
    int userInput = 1;

    while (userInput != 0){
      System.out.println("Enter a number for command");
      System.out.println(" 1: add, 2: subtract, 3: multiple, 4:divide, 5:fib, 6:inttoBinary 0: quit");
      userInput = scanner.nextInt();
      if (userInput == 1) {
        System.out.println("Enter two numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int addNum = calculator.add(num1,num2);
        System.out.println("Added number is " + addNum);
      }
      if (userInput == 2) {
        System.out.println("Enter two numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int addNum = calculator.subtract(num1,num2);
        System.out.println("subtract number is " + addNum);
      }
      if (userInput == 3) {
        System.out.println("Enter two numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int addNum = calculator.multiply(num1,num2);
        System.out.println("multiplied number is " + addNum);
      }
      if (userInput == 4) {
        System.out.println("Enter two numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int addNum = calculator.divide(num1,num2);
        System.out.println("divide number is " + addNum);
      }

      if (userInput == 5) {
        System.out.println("Enter 1 numbers");
        int num1 = scanner.nextInt();
        int addNum = calculator.fibonacciNumberFinder(num1);
        System.out.println("fib number is " + addNum);
      }
      if (userInput == 6) {
        System.out.println("Enter 1 numbers");
        int num1 = scanner.nextInt();
        String addNum = calculator.intToBinaryNumber(num1);
        System.out.println("intToBinaryNumber number is " + addNum);
      }
    }
    System.out.println("GoodBYE");

  }
}
