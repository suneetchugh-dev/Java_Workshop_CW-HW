//Nested try Catch Block, also print error
class A
{
    public static void main(String args[])
    {
        try
        {
            int a=10,b=0,c;
            c=a/b;
            System.out.println("Result = "+c);
            try
            {
                int arr[]={1,2,3,4,5};
                System.out.println(arr[10]);
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Array Index is not present");
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("Number cannot be divided by zero");
            System.out.println(e);
        }
        System.out.println("End of the program");
    }
}

