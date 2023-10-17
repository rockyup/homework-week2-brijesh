package homework_week_6;
/**
 * Write a program to insert any temperature value in degree Fahrenheit and convert to degree Celsius
 */

import java.util.Scanner;

public class Programme7Temp {
    //scanner start
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Temp in fahrenheit");
        double fahrenheit = scanner.nextDouble(); //

        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("The Tepmerature in celsius is : " + celsius);
        scanner.close(); // scanner is closed
    }
}