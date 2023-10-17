package homework_week_6;

/**
 * Write a Java program to swap two variables.
 */
public class Programme15Swap {
    public static void main(String[] args) {
        // Declare two variables
        int a = 25;
        int b = 80;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        // Swap the values of a and b
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}