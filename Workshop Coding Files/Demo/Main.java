import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Locale locale = Locale.of("en", "US");
        ResourceBundle bundle = ResourceBundle.getBundle("MessagesBundle", locale);
        System.out.println(bundle.getString("greeting"));
    }
}