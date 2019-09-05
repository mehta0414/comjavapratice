import java.text.NumberFormat;

public class Test18 {
    public static void main(String[] args) {
        /*
        How to format numbers in java
         */

        // NumberFormat class is abstract hence cannot be instantiated
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(122122121.8711);
        System.out.println(result);

        System.out.println(NumberFormat.getCurrencyInstance().format(626622.778));

        NumberFormat percentInstance=NumberFormat.getPercentInstance();
        String res=percentInstance.format(2.87);
        System.out.println(res);

        // We can also use like below:

        String s=NumberFormat.getPercentInstance().format(0.1);
        System.out.println(s);


    }
}
