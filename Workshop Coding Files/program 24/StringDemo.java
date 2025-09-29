class StringDemo
{
    public static void main(String[] args)
    {
        java.lang.String str = "Hello World";
        System.out.println("Original string: " + str);
        System.out.println("Uppercase string: " + str.toUpperCase());
        String str1 = new String("Hello World");
        System.out.println("String 1: " + str1);
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str));
        //using byte (ascii characters) Array
        byte ascii[] = {65,66,67,68,69,97,98};
        String s = new String(ascii);
        System.out.println(s);
        //using char array
        char arr[] = {'H','e','l','l','o'};
        String s1 = new String(arr,2,3); //offset is where to start from which index, and count is how many elements do you want?
        System.out.println(s1);

    }
}


