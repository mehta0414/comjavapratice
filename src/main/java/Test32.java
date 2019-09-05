public class Test32 {
    public static void main(String[] args) {
        // For-each loop in Java
        // We can't iterate from end to begning, only from beginning
        // We can't access the index of the data type
        String[] fruits = {"Apple", "Mango", "Orange"};

        for (int i = 0; i < fruits.length; i++)
            System.out.println(fruits[i]);

        for(String s:fruits)
            System.out.println(s);
    }
}
