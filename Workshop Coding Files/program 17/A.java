class A
{
    public static void main(String[] args) {
        int a=10, b=0, c;
        try{
            c=a/b;
            System.out.println("Result: "+c);
        }
        catch(Exception e)
        {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}
