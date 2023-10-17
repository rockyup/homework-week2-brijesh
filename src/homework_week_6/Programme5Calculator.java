package homework_week_6;

import java.util.Scanner;
/**
 * calculator with addition, subtraction, multiplication and division methods all with parameters and use string concatenation methods.
 */
public class Programme5Calculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Use instance methods to perform the calculations
        Programme5Calculator calculator = new Programme5Calculator();
        String additionResult = calculator.addition(num1, num2);
        String subtractionResult = calculator.subtraction(num1, num2);

        // Use static methods to perform the calculations
        String multiplicationResult = Programme5Calculator.multiply(num1, num2);
        String divisionResult = Programme5Calculator.divide(num1, num2);

        System.out.println("Addition :" + additionResult);
        System.out.println("Sub :" + subtractionResult);
        System.out.println("Multi : " + multiplicationResult);
        System.out.println("Divi : " + divisionResult);
        scanner.close();
    }

    // Instance method for addition
    public String addition(double a, double b) {
        double result = a + b;
        return a + " + " + b + " = " + result;
    }

    // Instance method for subtraction
    public String subtraction(double a, double b) {
        double result = a - b;
        return a + " - " + b + " = " + result;
    }

    // Static method for multiplication
    public static String multiply(double a, double b) {
        double result = a * b;
        return a + " * " + b + " = " + result;
    }

    // Static method for division
    public static String divide(double a, double b) {
        if (b == 0) {
            return "Division by zero is not allowed.";
        }
        double result = a / b;
        return a + " / " + b + " = " + result;
        // Close the scanner to free resources

    }
}
