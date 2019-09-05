import java.util.Scanner;

public class Test30 {
    public static void main(String[] args) {
        // Do While loop

        String input = "";
        Scanner scanner = new Scanner(System.in);
        // With do while loops we check the condition at last of each iteration so
        // do while loop atleast get executed atleast once even if the condition is false
        // do while loop is rarely used.


        do {
            System.out.println("Enter the input");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        } while (!input.equals("quit"));

    }
}
