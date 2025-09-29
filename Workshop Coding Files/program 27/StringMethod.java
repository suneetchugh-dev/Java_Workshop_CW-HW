public class StringMethod {
    public static void main(String[] args) {
        // Creating string using literal (stored in string pool)
        String str1 = "Hello";
        
        // Creating string using new keyword (stored in heap memory)
        String str2 = new String("Hello");
        
        // Comparing using == operator (compares memory references)
        System.out.println("Using == operator:");
        System.out.println("str1 == str2: " + (str1 == str2));
        
        // Comparing using equals() method (compares content)
        System.out.println("\nUsing equals() method:");
        System.out.println("str1.equals(str2): " + str1.equals(str2));
        
        // Print memory addresses to show they are different
        System.out.println("\nMemory addresses:");
        System.out.println("str1: " + System.identityHashCode(str1));
        System.out.println("str2: " + System.identityHashCode(str2));
    }
}

