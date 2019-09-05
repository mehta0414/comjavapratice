import java.util.Scanner;

public class Test20 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        //method();
        method2();

    }

    static void method() {
        System.out.println("First method processing.....");
        System.out.print("Enter the input");    // Rohit Mehta
        String input = scanner.next().trim();  // take only single token
        System.out.println(input);  //Rohit
    }

    static void method2() {
        System.out.println("Second method processing....");
        System.out.println("Enter the input again");  // Rohit Mehta
        // chaining multiple methods
        String input2 = scanner.nextLine().trim();  // take complete line
        System.out.println(input2);  // Rohit Mehta

    }
}
