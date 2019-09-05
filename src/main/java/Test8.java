import java.util.Arrays;

public class Test8 {
    public static void main(String[] args) {
        // MultiDimensional Array


        // Below is the two dimensional array
        int[][] numbers = new int[2][2];  // 2 rows and 3 columns
        // To Print the multiple Dimensional Array
        numbers[0][0]=10;
        numbers[1][1]=20;
        System.out.println(Arrays.deepToString(numbers));


        // Below is the 3 dimensional array

        int[][][] t=new int[2][2][2];
        System.out.println(Arrays.deepToString(t));
    }
}
