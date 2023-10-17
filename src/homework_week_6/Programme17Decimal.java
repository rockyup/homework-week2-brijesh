package homework_week_6;

import java.util.Scanner;

/**
 * Write a Java program to convert a decimal number to binary number. Input Data:
 */
public class Programme17Decimal {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter a decimal number
        System.out.print("Input a Decimal Number: ");
        int decimalNumber = scanner.nextInt();
        // Convert the decimal number to a binary string
        String binaryNumber = Integer.toBinaryString(decimalNumber);
        // Display the result
        System.out.println("Binary number is: " + binaryNumber);
        // Close the scanner
        scanner.close();
    }
}
