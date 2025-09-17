import java.util.Scanner;
class demo
{
    public static void main(String[] abc) {
        System.out.println("Hello World of java");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter first number");
            int a = sc.nextInt();
            System.out.println("Enter second number");
            int b = sc.nextInt();
            int sum = a + b;
            System.out.println("The sum is: " + sum);
        }
    }
}

// End of code