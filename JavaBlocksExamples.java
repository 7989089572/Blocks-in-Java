/*
 * Demonstration of Static and Non-Static Blocks in Java
 */

public class JavaBlocksExample {

    // Static block: runs once when the class is loaded
    static {
        System.out.println("Static block executed! (Runs once when class is loaded)");
    }

    // Non-static block: runs every time an object is created
    {
        System.out.println("Non-static block executed! (Runs every time an object is created)");
    }

    // Constructor
    public JavaBlocksExample() {
        System.out.println("Constructor called!");
    }

    public static void main(String[] args) {
        System.out.println("Main method started.");

        // Creating first object
        JavaBlocksExample obj1 = new JavaBlocksExample();

        // Creating second object
        JavaBlocksExample obj2 = new JavaBlocksExample();
    }
}
