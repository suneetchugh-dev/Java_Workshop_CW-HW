//Calculate sum of N Numbers using CLA

class Multiplecla
{
    public static void main(String args[])
    {
        // Check if arguments are provided
        if(args.length == 0)
        {
            System.out.println("Please provide numbers as command line arguments.");
            System.out.println("Usage: java MultipleArguments <num1> <num2> ... <numN>");
            return;
        }
        
        int sum = 0;
        try 
        {
            for(int i = 0; i < args.length; i++)
            {
                sum += Integer.parseInt(args[i]);
            }
            System.out.println("Sum of " + args.length + " Numbers is: " + sum);
        }
        catch(NumberFormatException e)
        {
            System.out.println("Error: Please provide only valid integers as arguments.");
            System.out.println("Invalid argument found: " + e.getMessage());
        }
    }
}
