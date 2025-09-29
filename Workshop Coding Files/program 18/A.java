public class A {
    // This class demonstrates what a NullPointerException is and how it occurs

    public static void main(String[] args) {
        // Declare a String variable but don't initialize it (it's null)
        String text = null;

        // Example 1: Safe way to check for null
        System.out.println("--- Example 1: Safe Code ---");
        if (text != null) {
            System.out.println("Text length: " + text.length());
        } else {
            System.out.println("Text is null! Can't get its length.");
        }

        // Example 2: Code that will cause NullPointerException
        System.out.println("\n--- Example 2: Unsafe Code ---");
        try {
            // This will cause an error because we're trying to use a null object
            System.out.println("Text length: " + text.length());
        } catch (NullPointerException e) {
            // This catch block will handle the error
            System.out.println("Oops! We got a NullPointerException!");
            System.out.println("This happened because we tried to use a null object");
        }
        finally
        {
            System.out.println("This is the finally block which is always run");
        }

        // Example 3: Working with a valid string
        System.out.println("\n--- Example 3: Working Code ---");
        text = "Hello, Java!";  // Now text is not null
        System.out.println("Text length: " + text.length());  // This works fine
    }
}