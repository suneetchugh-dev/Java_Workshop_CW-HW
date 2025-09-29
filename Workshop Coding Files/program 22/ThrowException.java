class ThrowException {
    public static void main(String[] args) {
        try {
            // Manually throwing an exception
            throw new Exception("This is a manually thrown exception");
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}