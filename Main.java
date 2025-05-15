import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

      while (true) {
          System.out.println("/n--- Simple Calculator ---");
          System.out.println("Enter first number (or type 'exit' to quit): ");

      if (input.hasNextDouble()) {
        double num1 = input.nextDouble();

        System.out.println("Enter operator (+,-,*,/): ");
        char operator = input.next() .charAt(0);

        System.out.println("Enter second number: ");
        double num2 = input.nextDouble();

        double result;

        if (operator == '+') {
          result = num1 + num2;

        } else if (operator == '-') {
         result = num1 - num2;
        } else if (operator == '*') {
          result = num1 * num2;
        } else if (operator == '/') {
            if (num2 == 0) {
            System.out.println("Error: Divide by zero! ");
              continue;
            } 
          result = num1 / num2;
       } else {
          System.out.println("Invalid operator! ");
          continue;
        }
        System.out.println("Result: " + result);
      } else {
        String command = input.next();
        if (command.equalsIgnoreCase("exit")) {
          System.out.println("Goodbye! ");
          break;
        } else {
          System.out.println("Invalid input. Try again.");
        }
        
      }
    } 
  } 
}