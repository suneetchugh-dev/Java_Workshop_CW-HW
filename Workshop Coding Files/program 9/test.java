class test
{
    void show()
    {
        System.out.println(this); // memory address of current object
    }
    public static void main(String[] args) {
        test t = new test();
        System.out.println(t); // memory address of object created
        t.show();
    }
}