/* Learn Polymorphism using method overloading */
//Create Several Methods inside Compile class with same name but different parameters
class Compile
{
    void add()
    {
        int a=20, b=30, c;
        c=a+b;
        System.out.println("Addition of two numbers is:" + c);
    }

    double add(double x, double y)
    {
        double z;
        z=x+y;
        return z;
    }

    void add(int x, double y)
    {
        double z;
        z=x+y;
        System.out.println("Addition of two numbers is:" + z);
    }
    public static void main(String[] args) {
        Compile obj=new Compile();
        obj.add();
        obj.add(7.5,8.6);
    }
}