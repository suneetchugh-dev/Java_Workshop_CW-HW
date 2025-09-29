//multiple try catch block
class A
{
    public static void main(String args[])
    {
        int a=10,b=0,c[]={1,2,3};
        try
        {
            System.out.println("a/b = "+(a/b));
            System.out.println("c[5] = "+c[5]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index Out Of Bounds Exception");
        }
        System.out.println("End of the program");
    }
}