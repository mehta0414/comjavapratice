import java.util.Arrays;

public class Test7 {
    public static void main(String[] args) {

        // newer way to define the array
        // arrays have fixed length

        int[] num = {2, 3, 5, 1, 4};
        int length = num.length;
        System.out.println(length);
        System.out.println(num);
        System.out.println(num.toString());
        System.out.println(Arrays.toString(num));

        Arrays.sort(num);  // array is sorted
        System.out.println(Arrays.toString(num));
    }


}
