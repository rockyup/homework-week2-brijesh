package homework_week_6;

/**
 * Declare one instance and one static variable.
 * Declare one instance method.
 * Declare one static method.
 * Call both instance and static variables into both instance and static methods inside the print statement.
 * Declare the Main method.
 * Call both instance and static methods into the Main method and run the programme.
 */
public class Programme3 {
    int a = 90; // instance variable
    static String name = "krupa"; // static variable

    public void myMethod() {
        Programme3 p3 = new Programme3();
        System.out.println(p3.a);

    }

    public static void p4() {
        System.out.println(name);

    }

    public static void main(String[] args) {
        Programme3 a1 = new Programme3();
        a1.myMethod();
        p4();
    }
}
