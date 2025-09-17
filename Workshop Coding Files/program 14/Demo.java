/* Method Overriding */

class shape
{
    void show()
    {
        System.out.println("This is shape class");
    }
}

class square extends shape
{
    @Override
    void show()
    {
        System.out.println("This is square class");
    }
}

class Demo
{
    public static void main(String[] args)
    {
        square obj = new square();
        obj.show();
    }
}