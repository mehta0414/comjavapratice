import java.util.Scanner;

public class Test31 {
    public static void main(String[] args) {
        // breaks and continue

        String input = "";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the input");
            input = scanner.next().toLowerCase();
            if (input.equals("pass"))
                continue;
            if (input.equals("quit"))
                break;
            System.out.println(input);
        }
    }
}
