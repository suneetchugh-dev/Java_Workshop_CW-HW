public class Bufferclass {
    public static void main(String[] args)
    {
        //create a buffer class for me showcasing it can be modifed and normal string cant plus comment normal string
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb); // prints "Hello World"
        sb.insert(5, " Beautiful");
        System.out.println(sb); // prints "Hello Beautiful World"   
        // // Normal String
        // String str = "Hello";
        // str.concat(" World");
        // System.out.println(str); // prints "Hello"
        sb.replace(0,5,"Wonderful");
        System.out.println(sb);
        sb.delete(0,10);
        System.out.println(sb);

    }
}

