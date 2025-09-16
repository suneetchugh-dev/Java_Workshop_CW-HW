//Command Line Arguments

//Write a java program that prints sum of two numbers by using of Command Line Arguments.

class Arguments
{
    public static void main(String args[])
    {
        int a,b,sum;
        a=Integer.parseInt(args[0]);
        b=Integer.parseInt(args[1]);
        sum = a+b;
        System.out.println("Sum of two numbers is: "+ sum);
    }
}
