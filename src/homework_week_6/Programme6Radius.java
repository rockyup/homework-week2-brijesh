package homework_week_6;
/**
 * Write a program to enter any radius value of the circle and find out the area.
 */

import java.util.Scanner;

public class Programme6Radius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle is : " + area);
        scanner.close();// closing the scanner
    }
    }


