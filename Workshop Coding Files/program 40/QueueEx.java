import java.util.*;

public class QueueEx {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.add("Apple");
        q.add("Banana");
        q.add("Cherry");

        System.out.println("Queue:" + q);
        String Front = q.remove();
        System.out.println(Front);
}
}