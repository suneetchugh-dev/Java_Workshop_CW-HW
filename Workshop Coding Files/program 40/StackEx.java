import java.util.Stack;
public class StackEx {
    public static void main(String[] args) {
        Stack <Integer> Numbers=new Stack<Integer>();
        Numbers.push(1);
        Numbers.push(2);
        Numbers.push(3);
        System.out.println(Numbers);
        Numbers.pop();
        System.out.println(Numbers);
    }
}
