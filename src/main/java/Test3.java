public class Test3 {

    public static void main(String[] args) {

        // String is reference type in Java
        String message=new String("Hello World");
        System.out.println(message);

        // String literal with concatenate
        String message2="Hello" + " World";
        System.out.println(message2);
        String newMessage=message2.replace("H","F");
        System.out.println(newMessage);

        // Strings are immutable
        System.out.println(message2);

    }
}
