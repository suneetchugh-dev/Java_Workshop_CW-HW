import java.util.ArrayList;

public class ArrayListex {    
    public static void main(String[] args) 
    {
        //Making an arraylist of type String
        ArrayList<String> Name = new ArrayList<String>();
        Name.add("Biswajit");
        Name.add("Ajay");
        Name.add("Das");
        System.out.println(Name);
        Name.remove(1); //for removing specific element at specific index
        System.out.println(Name);
        for(String Name1 : Name)
        {
            System.out.println(Name1);
        }

        //Making an arraylist of type Integer
        ArrayList<Integer> Numbers = new ArrayList<Integer>();
        Numbers.add(1);
        Numbers.add(2);
        Numbers.add(3);
        System.out.println(Numbers);
        // Fixed: Store and display the value before modifying it
        int firstNumber = Numbers.get(0);
        System.out.println("First number before modification: " + firstNumber);
        Numbers.set(0, 10);
        System.out.println(Numbers);
    }
}
