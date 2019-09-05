public class Test15 {
    public static void main(String[] args) {

        byte x = 1;
        // java will store value of x in some anoymns int variable
        int y = x + 2;  // This is called implicit casting (which means automatic)
        System.out.println(y);

        double d = 1.1;
        double t = d + 2;  //1.1 +2.0
        System.out.println(t);

        // Implicit casting happens when we don't lose data
        // byte > short > int > long > float > double

        int h = 10;
        short s = (short) (h + 10);  // this is called explicit casting
        System.out.println(s);

        double j = 10.2;
        int b = (int) j + 2;
        System.out.println(b);      // Explicit casting

        // Explicit casting can only happens between compatible types ie
        // We can't cast a string to a number or vice versa


    }
}
