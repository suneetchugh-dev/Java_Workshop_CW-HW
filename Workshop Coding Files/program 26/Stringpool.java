public class Stringpool {
        public static void main(String[] args) {
            String s1 = "cat";
            String s2 = "cat";
            if(s1==s2)
            {
                System.out.println("true");
            }
            else
            {
                System.out.println("false");
            }
            System.out.println(System.identityHashCode(s1));
            System.out.println(System.identityHashCode(s2));
        }
}
