import java.util.LinkedList;
public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<Integer> Numbers = new LinkedList<Integer>();
        Numbers.add(1);
        Numbers.add(2);
        Numbers.add(3);
        System.out.println(Numbers);
        Numbers.set(0, 10);
        System.out.println(Numbers);
    }
}
