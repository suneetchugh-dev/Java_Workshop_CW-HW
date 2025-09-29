class ThrowException
{
    public static void main(String[] args) {
        int age = 19;
        if (age < 18) {
            try {
                throw new ArithmeticException("Age is less than 18");
            } catch (Exception e) {
                System.out.println("Caught an exception: " + e.getMessage());
            }
        } else {
            System.out.println("Age is valid");
        }
    }
}