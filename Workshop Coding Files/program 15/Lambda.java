interface DenoAno
{
    void method1();
    void method2();
}

class DemoAno implements DenoAno
{
    public void method1()
    {
        System.out.println("I am method 1");
    }
    public void method2()
    {
        System.out.println("I am method 2");
    }
}


public class Lambda
{
    public static void main(String[] args)
    {
        DemoAno obj=new DemoAno();
        obj.method1();
    }
}