package homework_week_6;

/**
 * Declare two instance and two static variables.
 * Declare one instance method.
 * Declare one static method.
 * Call all four instance and static variables into both instance and static methods inside the print statement.
 * Declare the Main method.
 * Call both instance and static methods into the Main method and run the programme.
 */
public class Programme4 {
    int a = 40; // instance variable
    String name = "Radha"; // instance varioble
    static String lastname = "kohli"; // static variable
    static int w = 100; // static variable

    public void k1() {
        Programme4 o1 = new Programme4();
        System.out.println(Programme4.lastname);
        System.out.println(Programme4.w);
        System.out.println(a);
        System.out.println(name);

    }

    public static void k2() {
        Programme4 l1 = new Programme4();
        l1.k1();
        System.out.println(l1.a);
        System.out.println(l1.name);
        System.out.println(lastname);
        System.out.println(w);

    }

    public static void main(String[] args) {
        k2();

    }
}
