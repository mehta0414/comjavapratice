public class Test14 {
    public static void main(String[] args) {

        // If there is no () then result would be as per BODMAS rule
        /*
        Order of Operators
        a) ()
        b) * and /
        c) + and -

         */
        int x=10+3*2;
        System.out.println(x);  //16

        int y=10+3-2+3;  // 14
        System.out.println(y);
    }
}
