class A
{
    void add()
    {
        int a=20;
        int b=30;
        System.out.println(a+b);
    }
    void display()
    {
        System.out.println("Addition of two numbers");
    }
    public static void main(String args[])
    {
        A obj=new A();
        // A obj2 = new A(); // [classname objectname = newkeyword classname();] => Object Creation
        obj.add();
        obj.display();
        // A.display(); error: non-static method display() cannot be referenced from a static context
    }
}
















