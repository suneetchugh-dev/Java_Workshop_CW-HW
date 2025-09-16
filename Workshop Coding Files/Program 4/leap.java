//write a program to check whether the year is leap year or not
import java.util.Scanner;
class leap
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your year");
        int year = obj.nextInt();
        if((year%4==0 && year%100!=0)||(year%400==0))
        {
            System.out.println(year + " is a leap year");
        } 
        else
        {
            System.out.println(year + " is not a leap year");
        }
    }
}