package homework_week_6;

/**
 * Write a Java program to convert a given string into lowercase. Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 */
public class Programme19Convert {
    public static void main(String[] args) {
        String input = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        // Convert the string to lowercase
        String lowercaseString = input.toLowerCase();
        // Display the lowercase string
        System.out.println("Original String: " + input);
        System.out.println("Lowercase String: " + lowercaseString);
    }
}
