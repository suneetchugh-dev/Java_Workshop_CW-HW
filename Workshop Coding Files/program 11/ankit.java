//Simple Inheritance

class student
{
    int roll_no;
    int marks;
    String name;
    void input()
    {
        System.out.println("Enter roll no, marks and name");
    }
}

class ankit extends student
{
    void disp()
    {
        roll_no=1;
        name="Ankit";
        marks=90;
        System.out.println(roll_no+" "+marks+" "+name);
    }
    public static void main(String[] args) {
        ankit ak = new ankit();
        ak.disp();
    }
}