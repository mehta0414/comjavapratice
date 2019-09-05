import java.util.Scanner;

public class Test29 {
    /*
    While is useful in situations where we don't know ahead of time how many times we need to
    repeat itself
     */
    public static void main(String[] args) {
        String input = "";
        Scanner scanner = new Scanner(System.in);
        while (!input.equals("quit")) {
            System.out.println("Enter the input");
            input = scanner.next().toLowerCase();
            if (!input.equals("quit"))
            System.out.println(input);
        }
    }
}
