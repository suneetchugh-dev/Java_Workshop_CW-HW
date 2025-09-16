class palindrome2
{
    public static void main(String[] args) {
        int num = 121; // You can change this number to test other cases
        int original = num;
        int reversed = 0;

        // Reverse the number using %
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }

        if (original == reversed) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}